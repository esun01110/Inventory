package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class edititempage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.edititempage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.edititempage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _editpageclv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
public double _format = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _itemname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _itemdescription = null;
public anywheresoftware.b4a.objects.EditTextWrapper _itemno = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _unitcontainer = null;
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
 //BA.debugLineNum = 51;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 52;BA.debugLine="editpageCLV.Clear";
_editpageclv._clear();
 //BA.debugLineNum = 53;BA.debugLine="editItem";
_edititem();
 //BA.debugLineNum = 54;BA.debugLine="UnitContainer.Add(\"Unit\")";
_unitcontainer.Add("Unit");
 //BA.debugLineNum = 55;BA.debugLine="UnitContainer.Add(\"set\")";
_unitcontainer.Add("set");
 //BA.debugLineNum = 56;BA.debugLine="UnitContainer.Add(\"box\")";
_unitcontainer.Add("box");
 //BA.debugLineNum = 57;BA.debugLine="UnitContainer.Add(\"ream\")";
_unitcontainer.Add("ream");
 //BA.debugLineNum = 58;BA.debugLine="UnitContainer.Add(\"doz\")";
_unitcontainer.Add("doz");
 //BA.debugLineNum = 59;BA.debugLine="UnitContainer.Add(\"pc\")";
_unitcontainer.Add("pc");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.edititempage parent) {
this.parent = parent;
}
b4a.example.edititempage parent;
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
 //BA.debugLineNum = 90;BA.debugLine="Dim result As Int = Msgbox2(\"Progress will not be";
_result = parent.__c.Msgbox2(BA.ObjectToCharSequence("Progress will not be save"),BA.ObjectToCharSequence("Close page"),"Yes","","Cancel",(android.graphics.Bitmap)(parent.__c.Null),ba);
 //BA.debugLineNum = 91;BA.debugLine="If result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 92;BA.debugLine="ClearViewfield";
parent._clearviewfield();
 //BA.debugLineNum = 93;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
 //BA.debugLineNum = 94;BA.debugLine="B4XPages.MainPage.DisplayData";
parent._b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._displaydata /*String*/ ();
 //BA.debugLineNum = 95;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 97;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"editPage\")";
_root.LoadLayout("editPage",ba);
 //BA.debugLineNum = 30;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 32;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("DeleteItem"));
 //BA.debugLineNum = 33;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 34;BA.debugLine="mi.Bitmap = xui.LoadBitmapResize(File.DirAssets,";
_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _xui.LoadBitmapResize(__c.File.getDirAssets(),"bin.png",__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)),__c.True);
 //BA.debugLineNum = 36;BA.debugLine="Dim mi As B4AMenuItem = B4XPages.AddMenuItem(Me,";
_mi = _b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("saveItem"));
 //BA.debugLineNum = 37;BA.debugLine="mi.AddToBar = True";
_mi.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 38;BA.debugLine="mi.Bitmap = xui.LoadBitmapResize(File.DirAssets,";
_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _xui.LoadBitmapResize(__c.File.getDirAssets(),"check.png",__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)),__c.True);
 //BA.debugLineNum = 40;BA.debugLine="ItemSupplierContainer.Text = B4XPages.MainPage.te";
_itemsuppliercontainer.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_suppitem /*String*/ ));
 //BA.debugLineNum = 42;BA.debugLine="editItem";
_edititem();
 //BA.debugLineNum = 43;BA.debugLine="UnitContainer.Add(\"Unit\")";
_unitcontainer.Add("Unit");
 //BA.debugLineNum = 44;BA.debugLine="UnitContainer.Add(\"set\")";
_unitcontainer.Add("set");
 //BA.debugLineNum = 45;BA.debugLine="UnitContainer.Add(\"box\")";
_unitcontainer.Add("box");
 //BA.debugLineNum = 46;BA.debugLine="UnitContainer.Add(\"ream\")";
_unitcontainer.Add("ream");
 //BA.debugLineNum = 47;BA.debugLine="UnitContainer.Add(\"doz\")";
_unitcontainer.Add("doz");
 //BA.debugLineNum = 48;BA.debugLine="UnitContainer.Add(\"pc\")";
_unitcontainer.Add("pc");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
boolean _itemnames = false;
boolean _description = false;
boolean _no = false;
boolean _quantity = false;
boolean _ucost = false;
boolean _itemamount = false;
 //BA.debugLineNum = 64;BA.debugLine="Private Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 66;BA.debugLine="Dim ItemNames As Boolean = itemName.Text.Length >";
_itemnames = _itemname.getText().length()>0;
 //BA.debugLineNum = 67;BA.debugLine="Dim description As Boolean = ItemDescription.Text";
_description = _itemdescription.getText().length()>0;
 //BA.debugLineNum = 68;BA.debugLine="Dim No As Boolean = ItemNo.Text.Length > 0";
_no = _itemno.getText().length()>0;
 //BA.debugLineNum = 69;BA.debugLine="Dim quantity As Boolean = ItemQuantity.Text.Lengt";
_quantity = _itemquantity.getText().length()>0;
 //BA.debugLineNum = 70;BA.debugLine="Dim Ucost As Boolean = UnitCost.Text.Length > 0";
_ucost = _unitcost.getText().length()>0;
 //BA.debugLineNum = 71;BA.debugLine="Dim ItemAmount As Boolean = Amount.Text.Length >";
_itemamount = _amount.getText().length()>0;
 //BA.debugLineNum = 73;BA.debugLine="If Tag = \"saveItem\" Then";
if ((_tag).equals("saveItem")) { 
 //BA.debugLineNum = 74;BA.debugLine="If ItemNames And description And No And quantity";
if (_itemnames && _description && _no && _quantity && _ucost && _itemamount) { 
 //BA.debugLineNum = 75;BA.debugLine="B4XPages.MainPage.Updatedata(ItemSupplierContai";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._updatedata /*String*/ (_itemsuppliercontainer.getText(),_itemname.getText(),_itemdescription.getText(),(int)(Double.parseDouble(_itemno.getText())),_unitcontainer.getSelectedItem(),(int)(Double.parseDouble(_itemquantity.getText())),(int)(Double.parseDouble(_unitcost.getText())),BA.NumberToString(_format));
 //BA.debugLineNum = 76;BA.debugLine="ClearViewfield";
_clearviewfield();
 //BA.debugLineNum = 77;BA.debugLine="ToastMessageShow(\"Updated Successfully\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Updated Successfully"),__c.False);
 //BA.debugLineNum = 78;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 }else {
 //BA.debugLineNum = 80;BA.debugLine="MsgboxAsync(\"Please Fill all necessary field\",";
__c.MsgboxAsync(BA.ObjectToCharSequence("Please Fill all necessary field"),BA.ObjectToCharSequence("Item Details"),ba);
 //BA.debugLineNum = 81;BA.debugLine="Return";
if (true) return "";
 };
 }else if((_tag).equals("DeleteItem")) { 
 //BA.debugLineNum = 84;BA.debugLine="B4XPages.MainPage.DeleteItem";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._deleteitem /*void*/ ();
 //BA.debugLineNum = 85;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private editpageCLV As CustomListView";
_editpageclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 5;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Public format As Double";
_format = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public itemName As EditText";
_itemname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Public ItemDescription As EditText";
_itemdescription = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Public ItemNo As EditText";
_itemno = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public UnitContainer As Spinner";
_unitcontainer = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public ItemQuantity As EditText";
_itemquantity = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Public UnitCost As EditText";
_unitcost = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public Amount As EditText";
_amount = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private ItemSupplierContainer As Label";
_itemsuppliercontainer = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _clearviewfield() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Private Sub ClearViewfield";
 //BA.debugLineNum = 122;BA.debugLine="itemName.Text = \"\"";
_itemname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 123;BA.debugLine="ItemDescription.Text = \"\"";
_itemdescription.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 124;BA.debugLine="ItemNo.Text = \"\"";
_itemno.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 125;BA.debugLine="ItemQuantity.Text = \"\"";
_itemquantity.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 126;BA.debugLine="UnitCost.Text = \"\"";
_unitcost.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 127;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _edititem() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub editItem";
 //BA.debugLineNum = 102;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 103;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,120%y)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (120),ba));
 //BA.debugLineNum = 104;BA.debugLine="p.LoadLayout(\"editItemPage\")";
_p.LoadLayout("editItemPage",ba);
 //BA.debugLineNum = 105;BA.debugLine="editpageCLV.Add(p,\"\")";
_editpageclv._add(_p,(Object)(""));
 //BA.debugLineNum = 107;BA.debugLine="ItemSupplierContainer.Text = B4XPages.MainPage.te";
_itemsuppliercontainer.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_suppitem /*String*/ ));
 //BA.debugLineNum = 108;BA.debugLine="itemName.Text = B4XPages.MainPage.temp_Itemname";
_itemname.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_itemname /*String*/ ));
 //BA.debugLineNum = 109;BA.debugLine="ItemDescription.Text = B4XPages.MainPage.temp_Ite";
_itemdescription.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_itemdesc /*String*/ ));
 //BA.debugLineNum = 110;BA.debugLine="ItemNo.Text = B4XPages.MainPage.temp_ItemNo";
_itemno.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_itemno /*String*/ ));
 //BA.debugLineNum = 111;BA.debugLine="ItemQuantity.Text = B4XPages.MainPage.temp_ItemQu";
_itemquantity.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_itemquantity /*String*/ ));
 //BA.debugLineNum = 112;BA.debugLine="UnitCost.Text = B4XPages.MainPage.temp_UCost";
_unitcost.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_ucost /*String*/ ));
 //BA.debugLineNum = 113;BA.debugLine="Amount.Text = B4XPages.MainPage.temp_ItemTotalCos";
_amount.setText(BA.ObjectToCharSequence(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_itemtotalcost /*String*/ ));
 //BA.debugLineNum = 115;BA.debugLine="B4XPages.SetTitle(Me,B4XPages.MainPage.temp_Itemn";
_b4xpages._settitle /*String*/ (ba,this,(Object)(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_itemname /*String*/ ));
 //BA.debugLineNum = 117;BA.debugLine="Log(\"View_Item Data passed: \"& B4XPages.MainPage.";
__c.LogImpl("22555920","View_Item Data passed: "+_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._temp_itemname /*String*/ ,0);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
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
public String  _itemquantity_textchanged(String _old,String _new) throws Exception{
double _a = 0;
double _b = 0;
 //BA.debugLineNum = 155;BA.debugLine="Private Sub ItemQuantity_TextChanged (Old As Strin";
 //BA.debugLineNum = 156;BA.debugLine="If New.Length = 0 Then";
if (_new.length()==0) { 
 //BA.debugLineNum = 158;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 160;BA.debugLine="Try";
try { //BA.debugLineNum = 161;BA.debugLine="Dim a = UnitCost.Text, b = ItemQuantity.Text As";
_a = (double)(Double.parseDouble(_unitcost.getText()));
_b = (double)(Double.parseDouble(_itemquantity.getText()));
 //BA.debugLineNum = 162;BA.debugLine="If UnitCost.Text.Trim.Length = 0  And ItemQuant";
if (_unitcost.getText().trim().length()==0 && _itemquantity.getText().trim().length()==0) { 
 //BA.debugLineNum = 163;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 165;BA.debugLine="format = a * b";
_format = _a*_b;
 //BA.debugLineNum = 166;BA.debugLine="Amount.Text = MyFormat(format)";
_amount.setText(BA.ObjectToCharSequence(_myformat(_format)));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 169;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("221430286",__c.LastException(ba).getMessage(),0);
 };
 };
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public String  _myformat(double _d) throws Exception{
String _s = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub MyFormat(d As Double) As String";
 //BA.debugLineNum = 131;BA.debugLine="Dim s As String = NumberFormat2(d, 0, 2, 2, True)";
_s = __c.NumberFormat2(_d,(int) (0),(int) (2),(int) (2),__c.True);
 //BA.debugLineNum = 132;BA.debugLine="Return s.Replace(\".\", \",\")";
if (true) return _s.replace(".",",");
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _unitcost_textchanged(String _old,String _new) throws Exception{
double _a = 0;
double _b = 0;
 //BA.debugLineNum = 136;BA.debugLine="Private Sub UnitCost_TextChanged (Old As String, N";
 //BA.debugLineNum = 137;BA.debugLine="If New.Length = 0 Then";
if (_new.length()==0) { 
 //BA.debugLineNum = 139;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 141;BA.debugLine="Try";
try { //BA.debugLineNum = 142;BA.debugLine="Dim a = UnitCost.Text, b = ItemQuantity.Text As";
_a = (double)(Double.parseDouble(_unitcost.getText()));
_b = (double)(Double.parseDouble(_itemquantity.getText()));
 //BA.debugLineNum = 143;BA.debugLine="If UnitCost.Text.Trim.Length = 0  And ItemQuant";
if (_unitcost.getText().trim().length()==0 && _itemquantity.getText().trim().length()==0) { 
 //BA.debugLineNum = 144;BA.debugLine="Amount.Text = \"\"";
_amount.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 146;BA.debugLine="format = a * b";
_format = _a*_b;
 //BA.debugLineNum = 147;BA.debugLine="Amount.Text = MyFormat(format)";
_amount.setText(BA.ObjectToCharSequence(_myformat(_format)));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 150;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("221299214",__c.LastException(ba).getMessage(),0);
 };
 };
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
