package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class addsupplierpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.addsupplierpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.addsupplierpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
public b4a.example3.customlistview _supplierclv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _suppliername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _address = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pono = null;
public anywheresoftware.b4a.objects.EditTextWrapper _date = null;
public anywheresoftware.b4a.objects.EditTextWrapper _mop = null;
public anywheresoftware.b4a.objects.EditTextWrapper _addressdelivery = null;
public anywheresoftware.b4a.objects.EditTextWrapper _deldate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _delterm = null;
public anywheresoftware.b4a.objects.EditTextWrapper _payterm = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _addsuplierpanel() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub AddSuplierPanel";
 //BA.debugLineNum = 39;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 40;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115%y)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (115),ba));
 //BA.debugLineNum = 41;BA.debugLine="p.LoadLayout(\"Supplier\")";
_p.LoadLayout("Supplier",ba);
 //BA.debugLineNum = 42;BA.debugLine="SupplierCLV.Add(p,\"\")";
_supplierclv._add(_p,(Object)(""));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.addsupplierpage parent) {
this.parent = parent;
}
b4a.example.addsupplierpage parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 103;BA.debugLine="Dim result As Int = Msgbox2(\"Progress will not be";
_result = parent.__c.Msgbox2(BA.ObjectToCharSequence("Progress will not be save"),BA.ObjectToCharSequence("Confirm"),"Yes","","Cancel",(android.graphics.Bitmap)(parent.__c.Null),ba);
 //BA.debugLineNum = 105;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 106;BA.debugLine="ClearViewfield";
parent._clearviewfield();
 //BA.debugLineNum = 107;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
 //BA.debugLineNum = 108;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 110;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
b4a.example.b4xpagesmanager._b4amenuitem _mi = null;
 //BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 26;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"AddSupplier\")";
_root.LoadLayout("AddSupplier",ba);
 //BA.debugLineNum = 29;BA.debugLine="B4XPages.SetTitle(Me, \"Add Supplier\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Add Supplier"));
 //BA.debugLineNum = 31;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("saveSupplier"));
 //BA.debugLineNum = 32;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 33;BA.debugLine="mi.Bitmap = xui.LoadBitmapResize(File.DirAssets,";
_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _xui.LoadBitmapResize(__c.File.getDirAssets(),"check.png",__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)),__c.True);
 //BA.debugLineNum = 35;BA.debugLine="AddSuplierPanel";
_addsuplierpanel();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
boolean _suppnames = false;
boolean _addres = false;
boolean _tinno = false;
boolean _pno = false;
boolean _dates = false;
boolean _mopno = false;
boolean _addde = false;
boolean _deliverydates = false;
 //BA.debugLineNum = 74;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 76;BA.debugLine="SupplierCLV.Refresh";
_supplierclv._refresh();
 //BA.debugLineNum = 77;BA.debugLine="Dim SuppNames As Boolean = SupplierName.Text.Leng";
_suppnames = _suppliername.getText().length()>0;
 //BA.debugLineNum = 78;BA.debugLine="Dim addres As Boolean = Address.Text.Length > 0";
_addres = _address.getText().length()>0;
 //BA.debugLineNum = 79;BA.debugLine="Dim TinNo As Boolean = TIN.Text.Length > 0";
_tinno = _tin.getText().length()>0;
 //BA.debugLineNum = 80;BA.debugLine="Dim PNO As Boolean = PONo.Text.Length > 0";
_pno = _pono.getText().length()>0;
 //BA.debugLineNum = 81;BA.debugLine="Dim dates As Boolean = Date.Text.Length > 0";
_dates = _date.getText().length()>0;
 //BA.debugLineNum = 82;BA.debugLine="Dim MOPNo As Boolean = MOP.Text.Length > 0";
_mopno = _mop.getText().length()>0;
 //BA.debugLineNum = 83;BA.debugLine="Dim AddDe As Boolean = addressDelivery.Text.Lengt";
_addde = _addressdelivery.getText().length()>0;
 //BA.debugLineNum = 84;BA.debugLine="Dim deliveryDates As Boolean = DelDate.Text.Lengt";
_deliverydates = _deldate.getText().length()>0;
 //BA.debugLineNum = 88;BA.debugLine="If Tag = \"saveSupplier\" Then";
if ((_tag).equals("saveSupplier")) { 
 //BA.debugLineNum = 89;BA.debugLine="If SuppNames And addres And TinNo And PNO And da";
if (_suppnames && _addres && _tinno && _pno && _dates && _mopno && _addde && _deliverydates) { 
 //BA.debugLineNum = 90;BA.debugLine="B4XPages.MainPage.InsertSupplier(SupplierName.T";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._insertsupplier /*String*/ (_suppliername.getText(),_address.getText(),(int)(Double.parseDouble(_tin.getText())),_pono.getText(),_date.getText(),_mop.getText(),_addressdelivery.getText(),_deldate.getText(),_delterm.getText(),_payterm.getText());
 //BA.debugLineNum = 91;BA.debugLine="ClearViewfield";
_clearviewfield();
 //BA.debugLineNum = 92;BA.debugLine="ToastMessageShow(\"Updated Successfully\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Updated Successfully"),__c.False);
 //BA.debugLineNum = 93;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 }else {
 //BA.debugLineNum = 96;BA.debugLine="MsgboxAsync(\"Please Fill all necessary field\",";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please Fill all necessary field"),BA.ObjectToCharSequence("Item Details"),ba);
 //BA.debugLineNum = 97;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public SupplierCLV As CustomListView";
_supplierclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 7;BA.debugLine="Private SupplierName As EditText";
_suppliername = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Address As EditText";
_address = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private TIN As EditText";
_tin = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private PONo As EditText";
_pono = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private Date As EditText";
_date = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private MOP As EditText";
_mop = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private addressDelivery As EditText";
_addressdelivery = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private DelDate As EditText";
_deldate = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private Delterm As EditText";
_delterm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private PayTerm As EditText";
_payterm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _clearviewfield() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Private Sub ClearViewfield";
 //BA.debugLineNum = 115;BA.debugLine="SupplierName.Text = \"\"";
_suppliername.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 116;BA.debugLine="Address.Text = \"\"";
_address.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 117;BA.debugLine="TIN.Text = \"\"";
_tin.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 118;BA.debugLine="PONo.Text = \"\"";
_pono.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 119;BA.debugLine="Date.Text = \"\"";
_date.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 120;BA.debugLine="MOP.Text = \"\"";
_mop.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 121;BA.debugLine="addressDelivery.Text = \"\"";
_addressdelivery.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 122;BA.debugLine="DelDate.Text = \"\"";
_deldate.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 123;BA.debugLine="Delterm.Text = \"\"";
_delterm.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 124;BA.debugLine="PayTerm.Text = \"\"";
_payterm.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _dateclick_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 47;BA.debugLine="Private Sub DateClick_Click";
 //BA.debugLineNum = 48;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 49;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 50;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 51;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 52;BA.debugLine="Dim ret As Int = Dd.Show(\"\", \"Date\", \"Yes\", \"Canc";
_ret = _dd.Show("","Date","Yes","Cancel","",ba,(android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 55;BA.debugLine="If ret = DialogResponse.POSITIVE Then";
if (_ret==__c.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 56;BA.debugLine="Date.Text =  Dd.DayOfMonth & \"/\" & Dd.Month & \"/";
_date.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())+"/"+BA.NumberToString(_dd.getYear())));
 };
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _datedelivery_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 60;BA.debugLine="Private Sub DateDelivery_Click";
 //BA.debugLineNum = 61;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 62;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 63;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 64;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 66;BA.debugLine="Dim ret As Int = Dd.Show(\"Date of Delivery\", \"Dat";
_ret = _dd.Show("Date of Delivery","Date","Yes","Cancel","",ba,(android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 69;BA.debugLine="If ret = DialogResponse.POSITIVE Then";
if (_ret==__c.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 70;BA.debugLine="DelDate.Text = Dd.DayOfMonth & \" / \" & Dd.Month";
_deldate.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+" / "+BA.NumberToString(_dd.getMonth())+" / "+BA.NumberToString(_dd.getYear())));
 };
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
