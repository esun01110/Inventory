B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	
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
	
	Dim p As B4XView
	Private SupplierCLV As CustomListView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("editsupplierpage")
	
	B4XPages.GetManager.TransitionAnimationDuration = 0
	
	Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me, "DeleteSupplier")
	mi.AddToBar = True
	mi.Bitmap = xui.LoadBitmapResize(File.DirAssets, "bin.png", 25dip, 25dip, True)
	
	Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me, "saveSupplier")
	mi.AddToBar = True
	mi.Bitmap = xui.LoadBitmapResize(File.DirAssets, "check.png", 25dip, 25dip, True)
	
	displaySupplier
End Sub

Private Sub B4XPage_Appear
	SupplierCLV.Clear
	displaySupplier
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub B4XPage_MenuClick (Tag As String)
	
	Dim one As Boolean = SupplierName.Text.Length > 0
	Dim two As Boolean = Address.Text .Length > 0
	Dim three As Boolean = TIN.Text.Length > 0
	Dim four As Boolean = PONo.Text.Length > 0
	Dim five As Boolean = Date.Text.Length > 0
	Dim six As Boolean = MOP.Text.Length > 0
	Dim seven As Boolean = addressDelivery.Text.Length > 0
	Dim eight As Boolean = DelDate.Text.Length > 0
	Dim nine As Boolean = Delterm.Text.Length > 0
	Dim ten As Boolean = PayTerm.Text.Length > 0
					
	If Tag = "saveSupplier" Then
		If one And two And three And four And five And six And seven And eight And nine And ten Then
			B4XPages.MainPage.UpdateSupplier( SupplierName.Text,Address.Text,TIN.Text,PONo.Text,Date.Text,MOP.Text,addressDelivery.Text,DelDate.Text,Delterm.Text,PayTerm.Text)
			ClearViewfield
			ToastMessageShow("Updated Successfully", False)
			B4XPages.ClosePage(Me)
		Else
			MsgboxAsync("Please Fill all necessary field", "Supplier Details")
			Return
		End If
	Else If Tag = "DeleteSupplier" Then
		B4XPages.MainPage.DeleteSupplier
		B4XPages.ClosePage(Me)
	End If
End Sub

Private Sub B4XPage_CloseRequest As ResumableSub
	Dim result As Int = Msgbox2("Progress will not be save", "Close page", "Yes", "", "Cancel", Null)
	If result = DialogResponse.POSITIVE Then
		ClearViewfield
		B4XPages.ClosePage(Me)
		B4XPages.MainPage.DisplayData
		Return True
	Else
		Return False
	End If
End Sub

Private Sub displaySupplier
	
	p = xui.CreatePanel("")
	p.SetLayoutAnimated(100,0,0,100%x,120%y)
	p.LoadLayout("editsupplierpageContainer")
	SupplierCLV.Add(p,"")
	
	SupplierName.Text = B4XPages.MainPage.temp_Suppname
	Address.Text = B4XPages.MainPage.temp_Address
	TIN.Text = B4XPages.MainPage.temp_tin
	PONo.Text = B4XPages.MainPage.temp_PONo
	Date.Text = B4XPages.MainPage.temp_date
	MOP.Text = B4XPages.MainPage.temp_MOP
	addressDelivery.Text = B4XPages.MainPage.temp_POD
	DelDate.Text = B4XPages.MainPage.temp_DOD
	Delterm.Text = B4XPages.MainPage.temp_DelTerm
	PayTerm.Text = B4XPages.MainPage.temp_PayTerm
	
	B4XPages.SetTitle(Me, B4XPages.MainPage.temp_Suppname)
	
End Sub

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