package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class editsupplierpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.editsupplierpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.editsupplierpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
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
public anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
public b4a.example3.customlistview _supplierclv = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 46;BA.debugLine="SupplierCLV.Clear";
_supplierclv._clear();
 //BA.debugLineNum = 47;BA.debugLine="displaySupplier";
_displaysupplier();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.editsupplierpage parent) {
this.parent = parent;
}
b4a.example.editsupplierpage parent;
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
 //BA.debugLineNum = 83;BA.debugLine="Dim result As Int = Msgbox2(\"Progress will not be";
_result = parent.__c.Msgbox2(BA.ObjectToCharSequence("Progress will not be save"),BA.ObjectToCharSequence("Close page"),"Yes","","Cancel",(android.graphics.Bitmap)(parent.__c.Null),ba);
 //BA.debugLineNum = 84;BA.debugLine="If result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 85;BA.debugLine="ClearViewfield";
parent._clearviewfield();
 //BA.debugLineNum = 86;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
 //BA.debugLineNum = 87;BA.debugLine="B4XPages.MainPage.DisplayData";
parent._b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._displaydata /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 90;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
b4a.example.b4xpagesmanager._b4amenuitem _mi = null;
 //BA.debugLineNum = 27;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 28;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"editsupplierpage\")";
_root.LoadLayout("editsupplierpage",ba);
 //BA.debugLineNum = 32;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 34;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("DeleteSupplier"));
 //BA.debugLineNum = 35;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 36;BA.debugLine="mi.Bitmap = xui.LoadBitmapResize(File.DirAssets,";
_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _xui.LoadBitmapResize(__c.File.getDirAssets(),"bin.png",__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)),__c.True);
 //BA.debugLineNum = 38;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("saveSupplier"));
 //BA.debugLineNum = 39;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 40;BA.debugLine="mi.Bitmap = xui.LoadBitmapResize(File.DirAssets,";
_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _xui.LoadBitmapResize(__c.File.getDirAssets(),"check.png",__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)),__c.True);
 //BA.debugLineNum = 42;BA.debugLine="displaySupplier";
_displaysupplier();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
boolean _one = false;
boolean _two = false;
boolean _three = false;
boolean _four = false;
boolean _five = false;
boolean _six = false;
boolean _seven = false;
boolean _eight = false;
boolean _nine = false;
boolean _ten = false;
 //BA.debugLineNum = 53;BA.debugLine="Private Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 55;BA.debugLine="Dim one As Boolean = SupplierName.Text.Length > 0";
_one = _suppliername.getText().length()>0;
 //BA.debugLineNum = 56;BA.debugLine="Dim two As Boolean = Address.Text .Length > 0";
_two = _address.getText().length()>0;
 //BA.debugLineNum = 57;BA.debugLine="Dim three As Boolean = TIN.Text.Length > 0";
_three = _tin.getText().length()>0;
 //BA.debugLineNum = 58;BA.debugLine="Dim four As Boolean = PONo.Text.Length > 0";
_four = _pono.getText().length()>0;
 //BA.debugLineNum = 59;BA.debugLine="Dim five As Boolean = Date.Text.Length > 0";
_five = _date.getText().length()>0;
 //BA.debugLineNum = 60;BA.debugLine="Dim six As Boolean = MOP.Text.Length > 0";
_six = _mop.getText().length()>0;
 //BA.debugLineNum = 61;BA.debugLine="Dim seven As Boolean = addressDelivery.Text.Lengt";
_seven = _addressdelivery.getText().length()>0;
 //BA.debugLineNum = 62;BA.debugLine="Dim eight As Boolean = DelDate.Text.Length > 0";
_eight = _deldate.getText().length()>0;
 //BA.debugLineNum = 63;BA.debugLine="Dim nine As Boolean = Delterm.Text.Length > 0";
_nine = _delterm.getText().length()>0;
 //BA.debugLineNum = 64;BA.debugLine="Dim ten As Boolean = PayTerm.Text.Length > 0";
_ten = _payterm.getText().length()>0;
 //BA.debugLineNum = 66;BA.debugLine="If Tag = \"saveSupplier\" Then";
if ((_tag).equals("saveSupplier")) { 
 //BA.debugLineNum = 67;BA.debugLine="If one And two And three And four And five And s";
if (_one && _two && _three && _four && _five && _six && _seven && _eight && _nine && _ten) { 
 //BA.debugLineNum = 68;BA.debugLine="B4XPages.MainPage.UpdateSupplier( SupplierName.";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._updatesupplier /*String*/ (_suppliername.getText(),_address.getText(),(int)(Double.parseDouble(_tin.getText())),_pono.getText(),_date.getText(),_mop.getText(),_addressdelivery.getText(),_deldate.getText(),_delterm.getText(),_payterm.getText());
 //BA.debugLineNum = 69;BA.debugLine="ClearViewfield";
_clearviewfield();
 //BA.debugLineNum = 70;BA.debugLine="ToastMessageShow(\"Updated Successfully\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Updated Successfully"),__c.False);
 //BA.debugLineNum = 71;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 }else {
 //BA.debugLineNum = 73;BA.debugLine="MsgboxAsync(\"Please Fill all necessary field\",";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please Fill all necessary field"),BA.ObjectToCharSequence("Supplier Details"),ba);
 //BA.debugLineNum = 74;BA.debugLine="Return";
if (true) return "";
 };
 }else if((_tag).equals("DeleteSupplier")) { 
 //BA.debugLineNum = 77;BA.debugLine="B4XPages.MainPage.DeleteSupplier";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._deletesupplier /*void*/ ();
 //BA.debugLineNum = 78;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private SupplierName As EditText";
_suppliername = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private Address As EditText";
_address = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private TIN As EditText";
_tin = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private PONo As EditText";
_pono = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Date As EditText";
_date = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private MOP As EditText";
_mop = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private addressDelivery As EditText";
_addressdelivery = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private DelDate As EditText";
_deldate = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Delterm As EditText";
_delterm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private PayTerm As EditText";
_payterm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private SupplierCLV As CustomListView";
_supplierclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _clearviewfield() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Private Sub ClearViewfield";
 //BA.debugLineNum = 145;BA.debugLine="SupplierName.Text = \"\"";
_suppliername.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 146;BA.debugLine="Address.Text = \"\"";
_address.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 147;BA.debugLine="TIN.Text = \"\"";
_tin.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 148;BA.debugLine="PONo.Text = \"\"";
_pono.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 149;BA.debugLine="Date.Text = \"\"";
_date.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 150;BA.debugLine="MOP.Text = \"\"";
_mop.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 151;BA.debugLine="addressDelivery.Text = \"\"";
_addressdelivery.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 152;BA.debugLine="DelDate.Text = \"\"";
_deldate.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 153;BA.debugLine="Delterm.Text = \"\"";
_delterm.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 154;BA.debugLine="PayTerm.Text = \"\"";
_payterm.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _dateclick_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 116;BA.debugLine="Private Sub DateClick_Click";
 //BA.debugLineNum = 117;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 118;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 119;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 120;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 121;BA.debugLine="Dim ret As Int = Dd.Show(\"\", \"Date\", \"Yes\", \"Canc";
_ret = _dd.Show("","Date","Yes","Cancel","",ba,(android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 124;BA.debugLine="If ret = DialogResponse.POSITIVE Then";
if (_ret==__c.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 125;BA.debugLine="Date.Text =  Dd.DayOfMonth & \"/\" & Dd.Month & \"/";
_date.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())+"/"+BA.NumberToString(_dd.getYear())));
 };
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _datedelivery_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 129;BA.debugLine="Private Sub DateDelivery_Click";
 //BA.debugLineNum = 130;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 131;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 132;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 133;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 135;BA.debugLine="Dim ret As Int = Dd.Show(\"Date of Delivery\", \"Dat";
_ret = _dd.Show("Date of Delivery","Date","Yes","Cancel","",ba,(android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 138;BA.debugLine="If ret = DialogResponse.POSITIVE Then";
if (_ret==__c.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 139;BA.debugLine="DelDate.Text = Dd.DayOfMonth & \" / \" & Dd.Month";
_deldate.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+" / "+BA.NumberToString(_dd.getMonth())+" / "+BA.NumberToString(_dd.getYear())));
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _displaysupplier() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Private Sub displaySupplier";
 //BA.debugLineNum = 96;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 97;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,120%y)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (120),ba));
 //BA.debugLineNum = 98;BA.debugLine="p.LoadLayout(\"editsupplierpageContainer\")";
_p.LoadLayout("editsupplierpageContainer",ba);
 //BA.debugLineNum = 99;BA.debugLine="SupplierCLV.Add(p,\"\")";
_supplierclv._add(_p,(Object)(""));
 //BA.debugLineNum = 101;BA.debugLine="SupplierName.Text = B4XPages.MainPage.temp_Suppna";
_suppliername.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_suppname /*String*/ ));
 //BA.debugLineNum = 102;BA.debugLine="Address.Text = B4XPages.MainPage.temp_Address";
_address.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_address /*String*/ ));
 //BA.debugLineNum = 103;BA.debugLine="TIN.Text = B4XPages.MainPage.temp_tin";
_tin.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_tin /*String*/ ));
 //BA.debugLineNum = 104;BA.debugLine="PONo.Text = B4XPages.MainPage.temp_PONo";
_pono.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_pono /*String*/ ));
 //BA.debugLineNum = 105;BA.debugLine="Date.Text = B4XPages.MainPage.temp_date";
_date.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_date /*String*/ ));
 //BA.debugLineNum = 106;BA.debugLine="MOP.Text = B4XPages.MainPage.temp_MOP";
_mop.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_mop /*String*/ ));
 //BA.debugLineNum = 107;BA.debugLine="addressDelivery.Text = B4XPages.MainPage.temp_POD";
_addressdelivery.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_pod /*String*/ ));
 //BA.debugLineNum = 108;BA.debugLine="DelDate.Text = B4XPages.MainPage.temp_DOD";
_deldate.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_dod /*String*/ ));
 //BA.debugLineNum = 109;BA.debugLine="Delterm.Text = B4XPages.MainPage.temp_DelTerm";
_delterm.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_delterm /*String*/ ));
 //BA.debugLineNum = 110;BA.debugLine="PayTerm.Text = B4XPages.MainPage.temp_PayTerm";
_payterm.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_payterm /*String*/ ));
 //BA.debugLineNum = 112;BA.debugLine="B4XPages.SetTitle(Me, B4XPages.MainPage.temp_Supp";
_b4xpages._settitle /*String*/ (ba,this,(Object)(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_suppname /*String*/ ));
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
