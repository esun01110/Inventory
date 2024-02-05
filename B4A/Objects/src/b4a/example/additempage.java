package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class additempage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.additempage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.additempage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _supplierlist = null;
public double _format = 0;
public b4a.example3.customlistview _itemdetailclv = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _unitcontainer = null;
public b4a.example.addsupplierpage _pageaddsupplier = null;
public anywheresoftware.b4a.objects.EditTextWrapper _itemname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _itemdescription = null;
public anywheresoftware.b4a.objects.EditTextWrapper _itemno = null;
public anywheresoftware.b4a.objects.EditTextWrapper _itemquantity = null;
public anywheresoftware.b4a.objects.EditTextWrapper _unitcost = null;
public anywheresoftware.b4a.objects.EditTextWrapper _amount = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemsuppliercontainer = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 59;BA.debugLine="ItemSupplierContainer.Text = B4XPages.MainPage.sa";
_itemsuppliercontainer.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._sams /*String*/ ));
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.additempage parent) {
this.parent = parent;
}
b4a.example.additempage parent;
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
 //BA.debugLineNum = 115;BA.debugLine="Dim result As Int = Msgbox2(\"Progress will not be";
_result = parent.__c.Msgbox2(BA.ObjectToCharSequence("Progress will not be save"),BA.ObjectToCharSequence("Close page"),"Yes","","Cancel",(android.graphics.Bitmap)(parent.__c.Null),ba);
 //BA.debugLineNum = 116;BA.debugLine="If result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 117;BA.debugLine="ClearViewfield";
parent._clearviewfield();
 //BA.debugLineNum = 118;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
 //BA.debugLineNum = 119;BA.debugLine="ItemSupplierContainer.Text = \"\"";
parent._itemsuppliercontainer.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 120;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 122;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"addItem\")";
_root.LoadLayout("addItem",ba);
 //BA.debugLineNum = 31;BA.debugLine="B4XPages.SetTitle(Me, \"Add Item\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Add Item"));
 //BA.debugLineNum = 33;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("saveItem"));
 //BA.debugLineNum = 34;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 35;BA.debugLine="mi.Bitmap = xui.LoadBitmapResize(File.DirAssets,";
_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _xui.LoadBitmapResize(__c.File.getDirAssets(),"check.png",__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)),__c.True);
 //BA.debugLineNum = 37;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("AddSupplier"));
 //BA.debugLineNum = 38;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 39;BA.debugLine="mi.Bitmap = xui.LoadBitmapResize(File.DirAssets,";
_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _xui.LoadBitmapResize(__c.File.getDirAssets(),"supplier.png",__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)),__c.True);
 //BA.debugLineNum = 42;BA.debugLine="ItemSupplierContainer.Text = B4XPages.MainPage.sa";
_itemsuppliercontainer.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._sams /*String*/ ));
 //BA.debugLineNum = 43;BA.debugLine="ItemPanel";
_itempanel();
 //BA.debugLineNum = 45;BA.debugLine="pageAddSupplier.Initialize";
_pageaddsupplier._initialize /*Object*/ (ba);
 //BA.debugLineNum = 46;BA.debugLine="B4XPages.AddPage(\"SupplierPAge\",pageAddSupplier)";
_b4xpages._addpage /*String*/ (ba,"SupplierPAge",(Object)(_pageaddsupplier));
 //BA.debugLineNum = 47;BA.debugLine="B4XPages.GetPage(\"SupplierPAge\")";
_b4xpages._getpage /*Object*/ (ba,"SupplierPAge");
 //BA.debugLineNum = 49;BA.debugLine="UnitContainer.Add(\"Unit\")";
_unitcontainer.Add("Unit");
 //BA.debugLineNum = 50;BA.debugLine="UnitContainer.Add(\"set\")";
_unitcontainer.Add("set");
 //BA.debugLineNum = 51;BA.debugLine="UnitContainer.Add(\"box\")";
_unitcontainer.Add("box");
 //BA.debugLineNum = 52;BA.debugLine="UnitContainer.Add(\"ream\")";
_unitcontainer.Add("ream");
 //BA.debugLineNum = 53;BA.debugLine="UnitContainer.Add(\"doz\")";
_unitcontainer.Add("doz");
 //BA.debugLineNum = 54;BA.debugLine="UnitContainer.Add(\"pc\")";
_unitcontainer.Add("pc");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
boolean _supplier = false;
boolean _itemnames = false;
boolean _description = false;
boolean _no = false;
boolean _quantity = false;
boolean _ucost = false;
boolean _itemamount = false;
 //BA.debugLineNum = 85;BA.debugLine="Private Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 86;BA.debugLine="itemDetailclv.Refresh";
_itemdetailclv._refresh();
 //BA.debugLineNum = 88;BA.debugLine="Dim Supplier As Boolean = ItemSupplierContainer.T";
_supplier = _itemsuppliercontainer.getText().length()>0;
 //BA.debugLineNum = 89;BA.debugLine="Dim ItemNames As Boolean = itemName.Text.Length >";
_itemnames = _itemname.getText().length()>0;
 //BA.debugLineNum = 90;BA.debugLine="Dim description As Boolean = ItemDescription.Text";
_description = _itemdescription.getText().length()>0;
 //BA.debugLineNum = 91;BA.debugLine="Dim No As Boolean = ItemNo.Text.Length > 0";
_no = _itemno.getText().length()>0;
 //BA.debugLineNum = 92;BA.debugLine="Dim quantity As Boolean = ItemQuantity.Text.Lengt";
_quantity = _itemquantity.getText().length()>0;
 //BA.debugLineNum = 93;BA.debugLine="Dim Ucost As Boolean = UnitCost.Text.Length > 0";
_ucost = _unitcost.getText().length()>0;
 //BA.debugLineNum = 94;BA.debugLine="Dim ItemAmount As Boolean = Amount.Text.Length >";
_itemamount = _amount.getText().length()>0;
 //BA.debugLineNum = 96;BA.debugLine="If Tag = \"saveItem\" Then";
if ((_tag).equals("saveItem")) { 
 //BA.debugLineNum = 97;BA.debugLine="If ItemNames And description And No And quantity";
if (_itemnames && _description && _no && _quantity && _ucost && _itemamount && _supplier) { 
 //BA.debugLineNum = 98;BA.debugLine="B4XPages.MainPage.Insertdata(ItemSupplierContai";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._insertdata /*String*/ (_itemsuppliercontainer.getText(),_itemname.getText(),_itemdescription.getText(),(int)(Double.parseDouble(_itemno.getText())),_unitcontainer.getSelectedItem(),(int)(Double.parseDouble(_itemquantity.getText())),(int)(Double.parseDouble(_unitcost.getText())),BA.NumberToString(_format));
 //BA.debugLineNum = 99;BA.debugLine="ClearViewfield";
_clearviewfield();
 //BA.debugLineNum = 100;BA.debugLine="ToastMessageShow(\"Inserted Successfully\", False";
__c.ToastMessageShow(BA.ObjectToCharSequence("Inserted Successfully"),__c.False);
 //BA.debugLineNum = 101;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 }else {
 //BA.debugLineNum = 103;BA.debugLine="MsgboxAsync(\"Please Fill all necessary field\",";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please Fill all necessary field"),BA.ObjectToCharSequence("Item Details"),ba);
 //BA.debugLineNum = 104;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 107;BA.debugLine="If Tag = \"AddSupplier\" Then";
if ((_tag).equals("AddSupplier")) { 
 //BA.debugLineNum = 108;BA.debugLine="B4XPages.ShowPage(\"SupplierPAge\")";
_b4xpages._showpage /*String*/ (ba,"SupplierPAge");
 //BA.debugLineNum = 109;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 110;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Public SupplierList As Spinner";
_supplierlist = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public format As Double";
_format = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private itemDetailclv As CustomListView";
_itemdetailclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 8;BA.debugLine="Private UnitContainer As Spinner";
_unitcontainer = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Public pageAddSupplier As AddSupplierPage";
_pageaddsupplier = new b4a.example.addsupplierpage();
 //BA.debugLineNum = 12;BA.debugLine="Private itemName As EditText";
_itemname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private ItemDescription As EditText";
_itemdescription = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private ItemNo As EditText";
_itemno = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private ItemQuantity As EditText";
_itemquantity = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private UnitCost As EditText";
_unitcost = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Amount As EditText";
_amount = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ItemSupplierContainer As Label";
_itemsuppliercontainer = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _clearviewfield() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Private Sub ClearViewfield";
 //BA.debugLineNum = 129;BA.debugLine="itemName.Text = \"\"";
_itemname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 130;BA.debugLine="ItemDescription.Text = \"\"";
_itemdescription.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 131;BA.debugLine="ItemNo.Text = \"\"";
_itemno.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 132;BA.debugLine="ItemQuantity.Text = \"\"";
_itemquantity.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 133;BA.debugLine="UnitCost.Text = \"\"";
_unitcost.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 134;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
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
public String  _itempanel() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 63;BA.debugLine="Private Sub ItemPanel";
 //BA.debugLineNum = 64;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 65;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,100%y)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 66;BA.debugLine="p.LoadLayout(\"item\")";
_p.LoadLayout("item",ba);
 //BA.debugLineNum = 67;BA.debugLine="itemDetailclv.Add(p,\"\")";
_itemdetailclv._add(_p,(Object)(""));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _itemquantity_textchanged(String _old,String _new) throws Exception{
double _a = 0;
double _b = 0;
 //BA.debugLineNum = 164;BA.debugLine="Private Sub ItemQuantity_TextChanged (Old As Strin";
 //BA.debugLineNum = 165;BA.debugLine="If New.Length = 0 Then";
if (_new.length()==0) { 
 //BA.debugLineNum = 167;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 169;BA.debugLine="Try";
try { //BA.debugLineNum = 170;BA.debugLine="Dim a = UnitCost.Text, b = ItemQuantity.Text As";
_a = (double)(Double.parseDouble(_unitcost.getText()));
_b = (double)(Double.parseDouble(_itemquantity.getText()));
 //BA.debugLineNum = 171;BA.debugLine="If UnitCost.Text.Trim.Length = 0  And ItemQuant";
if (_unitcost.getText().trim().length()==0 && _itemquantity.getText().trim().length()==0) { 
 //BA.debugLineNum = 172;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 174;BA.debugLine="format = a * b";
_format = _a*_b;
 //BA.debugLineNum = 175;BA.debugLine="Amount.Text = MyFormat(format)";
_amount.setText(BA.ObjectToCharSequence(_myformat(_format)));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 178;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("221364750",__c.LastException(ba).getMessage(),0);
 };
 };
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _myformat(double _d) throws Exception{
String _s = "";
 //BA.debugLineNum = 138;BA.debugLine="Sub MyFormat(d As Double) As String";
 //BA.debugLineNum = 139;BA.debugLine="Dim s As String = NumberFormat2(d, 0, 2, 2, True)";
_s = __c.NumberFormat2(_d,(int) (0),(int) (2),(int) (2),__c.True);
 //BA.debugLineNum = 140;BA.debugLine="Return s.Replace(\".\", \",\")";
if (true) return _s.replace(".",",");
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _unitcost_textchanged(String _old,String _new) throws Exception{
double _a = 0;
double _b = 0;
 //BA.debugLineNum = 145;BA.debugLine="Private Sub UnitCost_TextChanged (Old As String, N";
 //BA.debugLineNum = 146;BA.debugLine="If New.Length = 0 Then";
if (_new.length()==0) { 
 //BA.debugLineNum = 148;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 150;BA.debugLine="Try";
try { //BA.debugLineNum = 151;BA.debugLine="Dim a = UnitCost.Text, b = ItemQuantity.Text As";
_a = (double)(Double.parseDouble(_unitcost.getText()));
_b = (double)(Double.parseDouble(_itemquantity.getText()));
 //BA.debugLineNum = 152;BA.debugLine="If UnitCost.Text.Trim.Length = 0  And ItemQuant";
if (_unitcost.getText().trim().length()==0 && _itemquantity.getText().trim().length()==0) { 
 //BA.debugLineNum = 153;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 155;BA.debugLine="format = a * b";
_format = _a*_b;
 //BA.debugLineNum = 156;BA.debugLine="Amount.Text = MyFormat(format)";
_amount.setText(BA.ObjectToCharSequence(_myformat(_format)));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 159;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("221233678",__c.LastException(ba).getMessage(),0);
 };
 };
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
