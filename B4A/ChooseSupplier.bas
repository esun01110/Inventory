B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private CustomListView1 As CustomListView
	
	Private itemlist As B4XView
	Private sam As String
	Private SupplierHolder As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("ChooseSupplier")
	clv
	
	
End Sub

Private Sub clv
	
	'Dim ListOfItems As List
	'ListOfItems = B4XPages.MainPage.parser.NextArray 'returns a list with maps
	'pageAddItem.SupplierList.Initialize("asd")
	'SupplierListCLV.Clear
	itemlist = xui.CreatePanel("")
	itemlist.SetLayoutAnimated(100,0,0,100%x,50dip)
	itemlist.LoadLayout("displaysupplier")
	CustomListView1.Add(itemlist,"")
						
	'temp_Suppname = item.Get("supplier_name")
	SupplierHolder.Text = B4XPages.MainPage.temp_Suppname 'Item.Get("supplier_name")
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	
	Sleep(250)
	itemlist = CustomListView1.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sam = itemlist.GetView(0).Text           'lblTitle is first pnlTitle View
	Log(sam)
	
	
	
	
	
End Sub