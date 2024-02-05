B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Dim p As B4XView
	Public SupplierCLV As CustomListView
	
	Private SupplierName As EditText
	Private Address As EditText
	Private TIN As EditText
	Private PONo As EditText
	Private Date As EditText
	Private MOP As EditText
	Private addressDelivery As EditText
	Private DelDate As EditText
	Private Delterm As EditText
	Private PayTerm As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("AddSupplier")
	B4XPages.SetTitle(Me, "Add Supplier")
	
	Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me, "saveSupplier")
	mi.AddToBar = True
	mi.Bitmap = xui.LoadBitmapResize(File.DirAssets, "check.png", 25dip, 25dip, True)
	
	AddSuplierPanel
End Sub

Private Sub AddSuplierPanel
	p = xui.CreatePanel("")
	p.SetLayoutAnimated(100,0,0,100%x,115%y)
	p.LoadLayout("Supplier")
	SupplierCLV.Add(p,"")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub DateClick_Click
	Dim Dd As DateDialog 
	Dd.Year = DateTime.GetYear(DateTime.Now)
	Dd.Month = DateTime.GetMonth(DateTime.Now)
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
	Dim ret As Int = Dd.Show("", "Date", "Yes", "Cancel", "", Null)
'	Dim fda As Int = Dd.ShowAsync("", "Date", "Yes", "Cancel", "", Null, False)
	
	If ret = DialogResponse.POSITIVE Then
		Date.Text =  Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year
	End If
End Sub

Private Sub DateDelivery_Click
	Dim Dd As DateDialog
	Dd.Year = DateTime.GetYear(DateTime.Now)
	Dd.Month = DateTime.GetMonth(DateTime.Now)
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
	
	Dim ret As Int = Dd.Show("Date of Delivery", "Date", "Yes", "Cancel", "", Null)
'	Dim fda As Int = Dd.ShowAsync("Date of Delivery", "Date", "Yes", "Cancel", "", Null, False)
	
	If ret = DialogResponse.POSITIVE Then
		DelDate.Text = Dd.DayOfMonth & " / " & Dd.Month & " / " & Dd.Year
	End If
End Sub

Sub B4XPage_MenuClick (Tag As String)
	
	SupplierCLV.Refresh
	Dim SuppNames As Boolean = SupplierName.Text.Length > 0
	Dim addres As Boolean = Address.Text.Length > 0
	Dim TinNo As Boolean = TIN.Text.Length > 0
	Dim PNO As Boolean = PONo.Text.Length > 0
	Dim dates As Boolean = Date.Text.Length > 0
	Dim MOPNo As Boolean = MOP.Text.Length > 0
	Dim AddDe As Boolean = addressDelivery.Text.Length > 0
	Dim deliveryDates As Boolean = DelDate.Text.Length > 0
'	Dim termDel As Boolean = Delterm.Text.Length > 0
'	Dim termPay As Boolean = PayTerm.Text.Length > 0
	
	If Tag = "saveSupplier" Then
		If SuppNames And addres And TinNo And PNO And dates And MOPNo And AddDe And deliveryDates Then
			B4XPages.MainPage.InsertSupplier(SupplierName.Text,Address.Text,TIN.Text,PONo.Text,Date.Text,MOP.Text,addressDelivery.Text,DelDate.Text,Delterm.Text,PayTerm.Text)
			ClearViewfield
			ToastMessageShow("Updated Successfully", False)
			B4XPages.ClosePage(Me)
			'B4XPages.MainPage.WobbleMenu1.SetCurrentTab(4)
		Else
			MsgboxAsync("Please Fill all necessary field", "Item Details")
			Return
		End If
	End If
	
End Sub
Private Sub B4XPage_CloseRequest As ResumableSub
	Dim result As Int = Msgbox2("Progress will not be save", "Confirm", "Yes", "", "Cancel", Null)
    
	If result = DialogResponse.POSITIVE Then
		ClearViewfield
		B4XPages.ClosePage(Me)
		Return True
	Else
		Return False
	End If
End Sub

Private Sub ClearViewfield
	SupplierName.Text = ""
	Address.Text = ""
	TIN.Text = ""
	PONo.Text = ""
	Date.Text = ""
	MOP.Text = ""
	addressDelivery.Text = ""
	DelDate.Text = ""
	Delterm.Text = ""
	PayTerm.Text = ""
End Sub

