B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region
'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	Private ip As String = ""
	Private itemlist As B4XView
	
	Private Drawer As B4XDrawer
	Private HamburgerIcon As B4XBitmap
	Public MainMenuClv As CustomListView
	
	Public temp_suppItem, temp_Itemname, temp_ItemDesc, temp_ItemNo, temp_ItemUnit, temp_ItemQuantity, temp_UCost, temp_ItemTotalCost As String
	Public tempSuppname, tempItemname, tempItemDesc, tempItemNo, tempItemUnit, tempItemQuantity, tempUCost, tempItemTotalCost As String
	Public temp_Suppname, temp_Address, temp_tin, temp_PONo, temp_date, temp_MOP, temp_POD,temp_DOD,temp_DelTerm,temp_PayTerm,temp_note As String
	
	Public pageAddItem As AddItemPage
	Public pageEditItem As editItemPage
	Public pageAddSupplier As AddSupplierPage
	Public editSupplier As editSupplierPage
	
	Private SupplierListCLV As CustomListView
	Private NoItemLabel As Label
	
	Private itemNameHolder As Label
	Private QuantityHolder As Label
	
	Private SuuplierCountLabel As Label
	Private ItemCountLabel As Label
	Private sam As String
	Private Search As EditText
	Public SupplierHolder As Label
	Private NoSupplierlbl As Label
	
	Public pSupplier As B4XView
	Public Suppliers As B4XView
	
	Private MenuPanel3 As Panel
	Public sams As String
	Private MainSupplierClv As CustomListView
	Private PanelSupplier As Panel
	Private MainSupplierHolder As Label
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	B4XPages.GetManager.TransitionAnimationDuration = 0
	B4XPages.SetTitle(Me,"School supplies")
	
	Drawer.Initialize(Me, "Drawer", Root, 280dip)
	Drawer.CenterPanel.LoadLayout("MainPage")
	Drawer.LeftPanel.LoadLayout("drawer")
	HamburgerIcon = xui.LoadBitmapResize(File.DirAssets, "hamburger-black.png", 24dip, 24dip, True)
	
	'SetActionBarColor(0xFFBEECFF)
	
	pageAddItem.Initialize
	B4XPages.AddPage("ItemAddPage",pageAddItem)
	pageAddItem = B4XPages.GetPage("ItemAddPage")
	
	pageAddSupplier.Initialize
	B4XPages.AddPage("SupplierPAge",pageAddSupplier)
	B4XPages.GetPage("SupplierPAge")
	
	pageEditItem.Initialize
	B4XPages.AddPage("editItemPage",pageEditItem)
	B4XPages.GetPage("editItemPage")
	
	editSupplier.Initialize
	B4XPages.AddPage("editSupplierPage",editSupplier)
	B4XPages.GetPage("editSupplierPage")
	
	B4XPages.AddMenuItem(Me,"Item")
	B4XPages.AddMenuItem(Me,"Supplier")
	
	ip = "192.168.43.189"
	'UI
	DisplayData
	DrawerSupplierClv
	MainCLV
End Sub
Private Sub B4XPage_Appear
	#if B4A	
	Sleep(0)
	B4XPages.GetManager.ActionBar.RunMethod("setDisplayHomeAsUpEnabled", Array(True))
	Dim bd As BitmapDrawable
	bd.Initialize(HamburgerIcon)
	B4XPages.GetManager.ActionBar.RunMethod("setHomeAsUpIndicator", Array(bd))
	#End If
	DisplayData
End Sub
Private Sub B4XPage_Disappear
	#if B4A
	B4XPages.GetManager.ActionBar.RunMethod("setHomeAsUpIndicator", Array(0))
	#end if
End Sub
Private Sub B4XPage_CloseRequest As ResumableSub
	#if B4A
	'home button
	If Main.ActionBarHomeClicked Then
		Drawer.LeftOpen = Not(Drawer.LeftOpen)
		Return False
	End If
	'back key
	If Drawer.LeftOpen Then
		Drawer.LeftOpen = False
		Return False
	End If
	#end if
	Return True
End Sub
Private Sub B4XPage_Resize (Width As Int, Height As Int)
	Drawer.Resize(Width, Height)
End Sub
Public Sub SetActionBarColor(Color As Int)
	Dim p As Phone
	Dim jo As JavaObject
	jo.InitializeContext
	Dim cd As ColorDrawable
	cd.Initialize(Color, 0)
	jo.RunMethodJO("getActionBar", Null).RunMethod("setBackgroundDrawable", Array(cd))
	
	If p.SdkVersion >= 21 Then
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setStatusBarColor", Array(Color))
	End If
End Sub
Private Sub DrawerSupplierClv
	'Drawer supplier clv
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(100,0,0,100%x,70dip)
	p.LoadLayout("displaysupplier")
	SupplierListCLV.Add(p,"")
	
End Sub
Private Sub B4XPage_MenuClick (Tag As String)
	If Tag = "Supplier" Then
		PanelSupplier.Visible = True
		B4XPages.SetTitle(Me,"Supplier")
	Else If Tag = "Item" Then
		PanelSupplier.Visible = False
		B4XPages.SetTitle(Me,"School supplies")
	End If
End Sub
Private Sub MainCLV
	'Main CLV
	Dim q As B4XView = xui.CreatePanel("")
	q.SetLayoutAnimated(100,0,0,100%x,70dip)
	q.LoadLayout("itemDisplay")
	SupplierListCLV.Add(q,"")
End Sub
Private Sub addItem_Click
	MenuPanel3.Visible = True
End Sub
Private Sub addsupplier_Click
	
	B4XPages.ShowPage("SupplierPAge")
	B4XPages.GetManager.TransitionAnimationDuration = 0
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name Is B4XPage.

'------------
Public Sub DisplayData
	'display data to itemList panel
	MainMenuClv.Clear
	Try
		
		Dim CountitemTotalCost As HttpJob
		CountitemTotalCost.Initialize("CountitemTotalCost", Me)
		CountitemTotalCost.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "GetTotalCost"))
		
		
		Dim Countitem As HttpJob
		Countitem.Initialize("Countitem", Me)
		Countitem.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "CountItem"))
		
		Dim Countitem As HttpJob
		Countitem.Initialize("Countsupplier", Me)
		Countitem.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "CountSupplier"))

'		get item
		Dim GetPersons As HttpJob
		GetPersons.Initialize("Getitem", Me)
		GetPersons.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "GetItem"))
		
		'get supplier
		Dim Getsupplier As HttpJob
		Getsupplier.Initialize("Getsupplier", Me)
		Getsupplier.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "GetSupplier"))
		
		
		Dim GetsupplierMain As HttpJob
		GetsupplierMain.Initialize("GetsupplierMain", Me)
		GetsupplierMain.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "GetSupplierMain"))
	Catch
		Log(LastException)
		'Log(ResponseError. Reason: java.net.UnknownHostException: Unable To resolve host "inventory": No address associated with hostname, Response: )
	End Try
End Sub

Public Sub Insertdata(supplier As String, item_Name As String, item_Description As String, item_No As Int, item_Unit As String, _
					 item_quantity As Int, item_UnitCost As Int, item_TotalCost As String)
	
	Dim InsertItem As HttpJob
	InsertItem.Initialize("InsertItem", Me)
	InsertItem.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "InsertNewItem", _
					 "supplier", supplier, "item_name", item_Name, "item_description", item_Description, "item_no", item_No, "item_unit", item_Unit, _
					 "item_quantity", item_quantity, "item_unitcost", item_UnitCost, "item_totalcost", item_TotalCost))
	DisplayData
End Sub

Public Sub InsertSupplier(supplier_Name As String, supplier_address As String, supplier_tin As Int, supplier_pno As String, supplier_date As String, _
						 supplier_mop As String, supplier_PoD As String, supplier_DoD As String, supplier_DT As String, supplier_PT As String)
	
	Dim InsertSupp As HttpJob
	InsertSupp.Initialize("InsertSupp", Me)
	InsertSupp.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "InsertNewSupp", _
						 "supplier_name", supplier_Name, "supplier_address", supplier_address, "supplier_tin", supplier_tin, "supplier_pno", supplier_pno, _
						 "supplier_date", supplier_date, "supplier_mop", supplier_mop, "supplier_PoD", supplier_PoD, "supplier_DoD", supplier_DoD, _
						 "supplier_DT", supplier_DT, "supplier_PT", supplier_PT))
	DisplayData
End Sub

Public Sub Updatedata(ItemSupplier As String,item_Name As String, item_Description As String, item_No As Int, item_Unit As String, item_quantity As Int, item_UnitCost As Int, item_TotalCost As String)
	
	Dim UpdateItem As HttpJob
	UpdateItem.Initialize("UpdateItem", Me)
	UpdateItem.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "UpdateExistingItem", "updateData", sam, _
					 "supplier", ItemSupplier, "item_name", item_Name, "item_description", item_Description, "item_no", item_No, "item_unit", item_Unit, _
					 "item_quantity", item_quantity, "item_unitcost", item_UnitCost, "item_totalcost", item_TotalCost))
	DisplayData
	
End Sub

Public Sub UpdateSupplier(supplier_Name As String, supplier_address As String, supplier_tin As Int, supplier_pno As String, supplier_date As String, _
						 supplier_mop As String, supplier_PoD As String, supplier_DoD As String, supplier_DT As String, supplier_PT As String)
	
	Dim UpdateSupp As HttpJob
	UpdateSupp.Initialize("UpdateSupply", Me)
	UpdateSupp.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "UpdateExistingSupp", "updateSupplier", sam, _
						"supplier_name", supplier_Name, "supplier_address", supplier_address, "supplier_tin", supplier_tin, "supplier_pno", supplier_pno, _
						 "supplier_date", supplier_date, "supplier_mop", supplier_mop, "supplier_PoD", supplier_PoD, "supplier_DoD", supplier_DoD, _
						 "supplier_DT", supplier_DT, "supplier_PT", supplier_PT))
	DisplayData
	
End Sub

Sub JobDone(Job As HttpJob)
	ProgressDialogHide
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Log("Back from Job:" & Job.JobName)
		Log("Response from server: " & res)

		Dim parser As JSONParser
		parser.Initialize(res)
		
		Select Job.JobName

			Case "Getitem"
				Dim ListOfItems As List
				ListOfItems = parser.NextArray 'returns a list with maps

				MainMenuClv.Clear
			
				If ListOfItems.Size = 0 Then
					NoItemLabel.Visible = True
				Else
					NoItemLabel.Visible = False
					For i = 0 To ListOfItems.Size - 1
						Dim item As Map
						item = ListOfItems.Get(i)

						' Item
						itemlist = xui.CreatePanel("")
						itemlist.SetLayoutAnimated(100, 0, 0, 100%x, 50dip)
						itemlist.LoadLayout("itemDisplay")
						MainMenuClv.Add(itemlist, "")

						' Retrieve values from the map
						itemNameHolder.Text = item.Get("item_name")
						QuantityHolder.Text = item.Get("item_quantity")
			
					Next
				End If
				
			Case "Getsupplier"
				
				Dim ListOfItems As List
				ListOfItems = parser.NextArray 'returns a list with maps
				
				SupplierListCLV.Clear
			
				If ListOfItems.Size = 0 Then
					NoSupplierlbl.Visible = True
				Else
					NoSupplierlbl.Visible = False
					For i = 0 To ListOfItems.Size - 1
						Dim item As Map
						item = ListOfItems.Get(i)
						
						pSupplier = xui.CreatePanel("")
						pSupplier.SetLayoutAnimated(100,0,0,100%x,50dip)
						pSupplier.LoadLayout("displaysupplier")
						SupplierListCLV.Add(pSupplier,"")
						
						SupplierHolder.Text = item.Get("supplier_name")
						 
						'tempSuppname = item.Get("supplier_name")
		
					Next
				End If
			
			Case "GetsupplierMain"
				Dim ListOfItems As List
				ListOfItems = parser.NextArray 'returns a list with maps
				
				MainSupplierClv.Clear
			
				If ListOfItems.Size = 0 Then
					NoSupplierlbl.Visible = True
				Else
					NoSupplierlbl.Visible = False
					For i = 0 To ListOfItems.Size - 1
						Dim item As Map
						item = ListOfItems.Get(i)
						
						Suppliers = xui.CreatePanel("")
						Suppliers.SetLayoutAnimated(100,0,0,100%x,50dip)
						Suppliers.LoadLayout("displaySupplierOnMain")
						MainSupplierClv.Add(Suppliers,"")
						
						MainSupplierHolder.Text = item.Get("supplier_name")
						 
						'tempSuppname = item.Get("supplier_name")
		
					Next
				End If
				
			Case "Countitem"
	
				ItemCountLabel.Text = parser.NextValue
			
			Case "Countsupplier"
				
				SuuplierCountLabel.Text = parser.NextValue
				
'			Case "CountitemTotalCost"
'				
'				Dim sum As Int
'				Dim num As Int
'				Dim dataHolder As String
'				
'				Dim ListOfItems As List
'				ListOfItems = parser.NextArray 'returns a list with maps
'				
'				If ListOfItems.Size = 0 Then
''					TotalExpensesHolder.Text = "No item"
'				Else
'					For i = 0 To ListOfItems.Size - 1
'						Dim item As Map
'						item = ListOfItems.Get(i)
'						
'						dataHolder = item.Get("TotalCost")
'						num = dataHolder
'						sum = sum + num
'						'TotalExpensesHolder.Text = MyFormat(sum)
'					Next
'				End If
			Case "GetsupplierID"
				'Do nothing
				
			Case "InsertItem"
				'Do nothing
				
			Case "InsertSupp"
				'Do nothing
		
			Case "Updateitem"
				'Do nothing
				
			Case "UpdateSupply"
				
			Case "DeleteCLickedItem"
				'Do nothing
				
			Case "DeleteCLickedSupplier"
				'Do nothing
				
			Case "ViewCLickedItem" 'Item
				
				Dim ListOfItems As List
				ListOfItems = parser.NextArray 'returns a list with maps
				
				MainMenuClv.Clear

				If ListOfItems.Size = 0 Then
					NoItemLabel.Visible = True
				Else
					For i = 0 To ListOfItems.Size - 1
						Dim item As Map
						item = ListOfItems.Get(i)
						
						temp_suppItem = item.Get("supplier")
						temp_Itemname = item.Get("item_name")
						temp_ItemDesc = item.Get("item_description")
						temp_ItemNo  = item.Get("item_no")
						temp_ItemUnit = item.Get("item_unit")
						temp_ItemQuantity = item.Get("item_quantity")
						temp_UCost = item.Get("item_unitcost")
						temp_ItemTotalCost = item.Get("item_totalcost")
					
						Log("Edit item data: " & temp_Itemname)

					Next
				End If
				B4XPages.ShowPage("editItemPage")
				B4XPages.GetManager.TransitionAnimationDuration = 0
			
			Case "ViewCLickedSupplier" 'Supplier
				Dim ListOfItems As List
				ListOfItems = parser.NextArray 'returns a list with maps
				
				MainSupplierClv.Clear

				If ListOfItems.Size = 0 Then
					NoItemLabel.Visible = True
				Else
					For i = 0 To ListOfItems.Size - 1
						Dim item As Map
						item = ListOfItems.Get(i)
						
						'suppler
						
						temp_Suppname = item.Get("supplier_name")
						temp_Address = item.Get("supplier_address")
						temp_tin = item.Get("supplier_tin")
						temp_PONo  = item.Get("supplier_pno")
						temp_date = item.Get("supplier_date")
						temp_MOP = item.Get("supplier_mop")
						temp_POD = item.Get("supplier_PoD")
						temp_DOD = item.Get("supplier_DoD")
						temp_DelTerm = item.Get("supplier_DT")
						temp_PayTerm = item.Get("supplier_PT")
					
						Log("Edit item data: " & temp_Itemname)

					Next
				End If
				B4XPages.ShowPage("editSupplierPage")
				B4XPages.GetManager.TransitionAnimationDuration = 0
				
			Case "SearchItem"
				Dim ListOfItems As List
				ListOfItems = parser.NextArray 'returns a list with maps
	
				If ListOfItems.Size = 0 Then
					NoItemLabel.Visible = True
					NoItemLabel.Text = "No Item Found"
				Else
					'asscending
					For i = 0 To ListOfItems.Size - 1
						Dim item As Map
						item = ListOfItems.Get(i)
						Dim ItemName As String = item.Get("item_name")
						If Search.text.Length = 0 Or ItemName.ToLowerCase.Contains(Search.text.ToLowerCase)Then
							
							PanelSupplier.Visible = False
							
							'Seach Item
							itemlist = xui.CreatePanel("")
							itemlist.SetLayoutAnimated(100, 0, 0, 100%x, 50dip)
							itemlist.LoadLayout("itemDisplay")
							MainMenuClv.Add(itemlist, "")

							' Retrieve values from the map
							itemNameHolder.Text = item.Get("item_name")
							QuantityHolder.Text = item.Get("item_quantity")

							NoItemLabel.Visible = True
							NoItemLabel.Text = "No More Item Found"
						Else
							NoItemLabel.Visible = True
							NoItemLabel.Text = "No Item Found"
						End If
					Next
				End If
				
		End Select
	Else
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Private Sub MainMenuClv_ItemClick (Index As Int, Value As Object)
	Sleep(250)
	itemlist = MainMenuClv.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sam = itemlist.GetView(0).Text           'lblTitle is first pnlTitle View
	Log("CLicked: "& sam)
	
	'MainMenuClv.Clear
	
	Dim viewItemclicked As HttpJob
	viewItemclicked.Initialize("ViewCLickedItem", Me)
	viewItemclicked.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "ViewItem", "passedData", sam ))
	
End Sub

Private Sub MainSupplierClv_ItemClick (Index As Int, Value As Object)
	Sleep(250)
	itemlist = MainSupplierClv.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sam = itemlist.GetView(0).Text           'lblTitle is first pnlTitle View
	Log("Clicked Supplier: "& sam)
	
	Dim viewSupplierclicked As HttpJob
	viewSupplierclicked.Initialize("ViewCLickedSupplier", Me)
	viewSupplierclicked.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "ViewSupplier", "passedSupplier", sam ))

End Sub

Private Sub SupplierListCLV_ItemClick (Index As Int, Value As Object)
	Sleep(250)
	itemlist = SupplierListCLV.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sams = itemlist.GetView(0).Text           'lblTitle is first pnlTitle View
	Log("sams: "& sams)
	
	MenuPanel3.Visible = False
	B4XPages.ShowPage("ItemAddPage")
	B4XPages.GetManager.TransitionAnimationDuration = 0
End Sub

Private Sub Search_TextChanged (Old As String, New As String)
	MainMenuClv.Clear
	If New.Length = 0 Then
		' If the search text is empty, reload the entire list
		DisplayData
		PanelSupplier.Visible = False
	Else
		PanelSupplier.Visible = False
		Dim SearchItemName As HttpJob
		SearchItemName.Initialize("SearchItem", Me)
		SearchItemName.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "SearchedItem"))
	End If
	
End Sub

Private Sub ButtonCancel_Click
	MenuPanel3.Visible = False
End Sub

Public Sub DeleteSupplier
	Dim sf As Object = xui.Msgbox2Async("Delete Supplier?","","Delete","Cancel","",Null)
	Wait For (sf) Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Sleep(1000)
		Log("Supplier to DELETE: "& sam)
		Dim DeleteSupplierclicked As HttpJob
		DeleteSupplierclicked.Initialize("DeleteCLickedSupplier", Me)
		DeleteSupplierclicked.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "DeleteSupplier", " passedSupplierDelete", sam ))
		DisplayData
		ToastMessageShow("Supplier Deleted", False)
	End If
End Sub

Public Sub DeleteItem
	Dim sf As Object = xui.Msgbox2Async("Delete Item?","","Delete","Cancel","",Null)
	Wait For (sf) Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Sleep(1000)
		Log("item to DELETE: "& sam)
		Dim DeleteItemclicked As HttpJob
		DeleteItemclicked.Initialize("DeleteCLickedItem", Me)
		DeleteItemclicked.download2("http://" & ip & "/inventory/inventory_API.php", Array As String ("action", "DeleteItem", "passedDataDelete", sam ))
		DisplayData
		ToastMessageShow("Item Deleted", False)
	End If
End Sub

'Private Sub ItemPanel_Click
'	PanelSupplier.Visible = False
'	B4XPages.SetTitle(Me,"Home")
'End Sub
'
'Private Sub SupplierPanel_Click
'	PanelSupplier.Visible = True
'	PanelSupplier.Enabled = True
'	B4XPages.SetTitle(Me,"Supplier")
'End Sub
