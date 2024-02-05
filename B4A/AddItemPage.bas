B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Public SupplierList As Spinner
	Public format As Double
	
	Private itemDetailclv As CustomListView
	Private UnitContainer As Spinner
	
	Public pageAddSupplier As AddSupplierPage
	
	Private itemName As EditText
	Private ItemDescription As EditText
	Private ItemNo As EditText
	Private ItemQuantity As EditText
	Private UnitCost As EditText
	Private Amount As EditText

	Private ItemSupplierContainer As Label
End Sub
'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("addItem")
	B4XPages.SetTitle(Me, "Add Item")
	
	Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me, "saveItem")
	mi.AddToBar = True
	mi.Bitmap = xui.LoadBitmapResize(File.DirAssets, "check.png", 25dip, 25dip, True)
	
	Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me, "AddSupplier")
	mi.AddToBar = True
	mi.Bitmap = xui.LoadBitmapResize(File.DirAssets, "supplier.png", 25dip, 25dip, True)
	
	
	ItemSupplierContainer.Text = B4XPages.MainPage.sams
	ItemPanel

	pageAddSupplier.Initialize
	B4XPages.AddPage("SupplierPAge",pageAddSupplier)
	B4XPages.GetPage("SupplierPAge")
	
	UnitContainer.Add("Unit")
	UnitContainer.Add("set")
	UnitContainer.Add("box")
	UnitContainer.Add("ream")
	UnitContainer.Add("doz")
	UnitContainer.Add("pc")
End Sub

Private Sub B4XPage_Appear
	
	ItemSupplierContainer.Text = B4XPages.MainPage.sams
	
End Sub

Private Sub ItemPanel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(100,0,0,100%x,100%y)
	p.LoadLayout("item")
	itemDetailclv.Add(p,"")
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

'Private Sub Total_Click
'	Try
'		Dim a = UnitCost.Text, b = ItemQuantity.Text As Double
'		If UnitCost.Text.Trim.Length = 0  And ItemQuantity.Text.Trim.Length = 0 Then
'			Amount.Text = ""
'		Else
'			format = a * b
'			Amount.Text = MyFormat(format)
'		End If
'	Catch
'		Log(LastException.Message)
'	End Try
'End Sub

Private Sub B4XPage_MenuClick (Tag As String)
	itemDetailclv.Refresh
	
	Dim Supplier As Boolean = ItemSupplierContainer.Text.Length > 0
	Dim ItemNames As Boolean = itemName.Text.Length > 0
	Dim description As Boolean = ItemDescription.Text.Length > 0
	Dim No As Boolean = ItemNo.Text.Length > 0
	Dim quantity As Boolean = ItemQuantity.Text.Length > 0
	Dim Ucost As Boolean = UnitCost.Text.Length > 0
	Dim ItemAmount As Boolean = Amount.Text.Length > 0
					
	If Tag = "saveItem" Then
		If ItemNames And description And No And quantity And Ucost And ItemAmount And Supplier  Then
			B4XPages.MainPage.Insertdata(ItemSupplierContainer.Text,itemName.Text,ItemDescription.Text,ItemNo.Text,UnitContainer.SelectedItem,ItemQuantity.Text,UnitCost.Text,format)
			ClearViewfield
			ToastMessageShow("Inserted Successfully", False)
			B4XPages.ClosePage(Me)
		Else
			MsgboxAsync("Please Fill all necessary field", "Item Details")
			Return
		End If
	End If
	If Tag = "AddSupplier" Then
		B4XPages.ShowPage("SupplierPAge")
		B4XPages.GetManager.TransitionAnimationDuration = 0
		B4XPages.ClosePage(Me)
	End If
End Sub

Private Sub B4XPage_CloseRequest As ResumableSub
	Dim result As Int = Msgbox2("Progress will not be save", "Close page", "Yes", "", "Cancel", Null)
	If result = DialogResponse.POSITIVE Then
		ClearViewfield
		B4XPages.ClosePage(Me)
		ItemSupplierContainer.Text = ""
		Return True
	Else
		Return False
	End If
End Sub


Private Sub ClearViewfield
	
	itemName.Text = ""
	ItemDescription.Text = ""
	ItemNo.Text = ""
	ItemQuantity.Text = ""
	UnitCost.Text = ""
	Amount.Text = ""
End Sub


Sub MyFormat(d As Double) As String
	Dim s As String = NumberFormat2(d, 0, 2, 2, True)
	Return s.Replace(".", ",")
End Sub



Private Sub UnitCost_TextChanged (Old As String, New As String)
	If New.Length = 0 Then
		' If the search text is empty, reload the entire list
		Amount.Text = ""
	Else
		Try
			Dim a = UnitCost.Text, b = ItemQuantity.Text As Double
			If UnitCost.Text.Trim.Length = 0  And ItemQuantity.Text.Trim.Length = 0 Then
				Amount.Text = ""
			Else
				format = a * b
				Amount.Text = MyFormat(format)
			End If
		Catch
			Log(LastException.Message)
		End Try
	End If
End Sub

Private Sub ItemQuantity_TextChanged (Old As String, New As String)
	If New.Length = 0 Then
		' If the search text is empty, reload the entire list
		Amount.Text = ""
	Else
		Try
			Dim a = UnitCost.Text, b = ItemQuantity.Text As Double
			If UnitCost.Text.Trim.Length = 0  And ItemQuantity.Text.Trim.Length = 0 Then
				Amount.Text = ""
			Else
				format = a * b
				Amount.Text = MyFormat(format)
			End If
		Catch
			Log(LastException.Message)
		End Try
	End If
End Sub