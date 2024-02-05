package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _ip = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _itemlist = null;
public b4a.example.b4xdrawer _drawer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _hamburgericon = null;
public b4a.example3.customlistview _mainmenuclv = null;
public String _temp_suppitem = "";
public String _temp_itemname = "";
public String _temp_itemdesc = "";
public String _temp_itemno = "";
public String _temp_itemunit = "";
public String _temp_itemquantity = "";
public String _temp_ucost = "";
public String _temp_itemtotalcost = "";
public String _tempsuppname = "";
public String _tempitemname = "";
public String _tempitemdesc = "";
public String _tempitemno = "";
public String _tempitemunit = "";
public String _tempitemquantity = "";
public String _tempucost = "";
public String _tempitemtotalcost = "";
public String _temp_suppname = "";
public String _temp_address = "";
public String _temp_tin = "";
public String _temp_pono = "";
public String _temp_date = "";
public String _temp_mop = "";
public String _temp_pod = "";
public String _temp_dod = "";
public String _temp_delterm = "";
public String _temp_payterm = "";
public String _temp_note = "";
public b4a.example.additempage _pageadditem = null;
public b4a.example.edititempage _pageedititem = null;
public b4a.example.addsupplierpage _pageaddsupplier = null;
public b4a.example.editsupplierpage _editsupplier = null;
public b4a.example3.customlistview _supplierlistclv = null;
public anywheresoftware.b4a.objects.LabelWrapper _noitemlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemnameholder = null;
public anywheresoftware.b4a.objects.LabelWrapper _quantityholder = null;
public anywheresoftware.b4a.objects.LabelWrapper _suupliercountlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemcountlabel = null;
public String _sam = "";
public anywheresoftware.b4a.objects.EditTextWrapper _search = null;
public anywheresoftware.b4a.objects.LabelWrapper _supplierholder = null;
public anywheresoftware.b4a.objects.LabelWrapper _nosupplierlbl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _psupplier = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _suppliers = null;
public anywheresoftware.b4a.objects.PanelWrapper _menupanel3 = null;
public String _sams = "";
public b4a.example3.customlistview _mainsupplierclv = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsupplier = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainsupplierholder = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _additem_click() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Private Sub addItem_Click";
 //BA.debugLineNum = 167;BA.debugLine="MenuPanel3.Visible = True";
_menupanel3.setVisible(__c.True);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _addsupplier_click() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Private Sub addsupplier_Click";
 //BA.debugLineNum = 171;BA.debugLine="B4XPages.ShowPage(\"SupplierPAge\")";
_b4xpages._showpage /*String*/ (ba,"SupplierPAge");
 //BA.debugLineNum = 172;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 94;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 95;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setDispl";
parent._b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(parent.__c.True)});
 //BA.debugLineNum = 96;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 97;BA.debugLine="bd.Initialize(HamburgerIcon)";
_bd.Initialize((android.graphics.Bitmap)(parent._hamburgericon.getObject()));
 //BA.debugLineNum = 98;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setHomeA";
parent._b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHomeAsUpIndicator",new Object[]{(Object)(_bd.getObject())});
 //BA.debugLineNum = 100;BA.debugLine="DisplayData";
parent._displaydata();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;

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
 //BA.debugLineNum = 110;BA.debugLine="If Main.ActionBarHomeClicked Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._main._actionbarhomeclicked /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 111;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
parent._drawer._setleftopen /*boolean*/ (parent.__c.Not(parent._drawer._getleftopen /*boolean*/ ()));
 //BA.debugLineNum = 112;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 115;BA.debugLine="If Drawer.LeftOpen Then";

case 4:
//if
this.state = 7;
if (parent._drawer._getleftopen /*boolean*/ ()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 116;BA.debugLine="Drawer.LeftOpen = False";
parent._drawer._setleftopen /*boolean*/ (parent.__c.False);
 //BA.debugLineNum = 117;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 120;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 56;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 57;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 58;BA.debugLine="B4XPages.SetTitle(Me,\"School supplies\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("School supplies"));
 //BA.debugLineNum = 60;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Root, 280dip)";
_drawer._initialize /*String*/ (ba,this,"Drawer",_root,__c.DipToCurrent((int) (280)));
 //BA.debugLineNum = 61;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"MainPage\")";
_drawer._getcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("MainPage",ba);
 //BA.debugLineNum = 62;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"drawer\")";
_drawer._getleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("drawer",ba);
 //BA.debugLineNum = 63;BA.debugLine="HamburgerIcon = xui.LoadBitmapResize(File.DirAsse";
_hamburgericon = _xui.LoadBitmapResize(__c.File.getDirAssets(),"hamburger-black.png",__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (24)),__c.True);
 //BA.debugLineNum = 67;BA.debugLine="pageAddItem.Initialize";
_pageadditem._initialize /*Object*/ (ba);
 //BA.debugLineNum = 68;BA.debugLine="B4XPages.AddPage(\"ItemAddPage\",pageAddItem)";
_b4xpages._addpage /*String*/ (ba,"ItemAddPage",(Object)(_pageadditem));
 //BA.debugLineNum = 69;BA.debugLine="pageAddItem = B4XPages.GetPage(\"ItemAddPage\")";
_pageadditem = (b4a.example.additempage)(_b4xpages._getpage /*Object*/ (ba,"ItemAddPage"));
 //BA.debugLineNum = 71;BA.debugLine="pageAddSupplier.Initialize";
_pageaddsupplier._initialize /*Object*/ (ba);
 //BA.debugLineNum = 72;BA.debugLine="B4XPages.AddPage(\"SupplierPAge\",pageAddSupplier)";
_b4xpages._addpage /*String*/ (ba,"SupplierPAge",(Object)(_pageaddsupplier));
 //BA.debugLineNum = 73;BA.debugLine="B4XPages.GetPage(\"SupplierPAge\")";
_b4xpages._getpage /*Object*/ (ba,"SupplierPAge");
 //BA.debugLineNum = 75;BA.debugLine="pageEditItem.Initialize";
_pageedititem._initialize /*Object*/ (ba);
 //BA.debugLineNum = 76;BA.debugLine="B4XPages.AddPage(\"editItemPage\",pageEditItem)";
_b4xpages._addpage /*String*/ (ba,"editItemPage",(Object)(_pageedititem));
 //BA.debugLineNum = 77;BA.debugLine="B4XPages.GetPage(\"editItemPage\")";
_b4xpages._getpage /*Object*/ (ba,"editItemPage");
 //BA.debugLineNum = 79;BA.debugLine="editSupplier.Initialize";
_editsupplier._initialize /*Object*/ (ba);
 //BA.debugLineNum = 80;BA.debugLine="B4XPages.AddPage(\"editSupplierPage\",editSupplier)";
_b4xpages._addpage /*String*/ (ba,"editSupplierPage",(Object)(_editsupplier));
 //BA.debugLineNum = 81;BA.debugLine="B4XPages.GetPage(\"editSupplierPage\")";
_b4xpages._getpage /*Object*/ (ba,"editSupplierPage");
 //BA.debugLineNum = 83;BA.debugLine="B4XPages.AddMenuItem(Me,\"Item\")";
_b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Item"));
 //BA.debugLineNum = 84;BA.debugLine="B4XPages.AddMenuItem(Me,\"Supplier\")";
_b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Supplier"));
 //BA.debugLineNum = 86;BA.debugLine="ip = \"192.168.43.90\"";
_ip = "192.168.43.90";
 //BA.debugLineNum = 88;BA.debugLine="DisplayData";
_displaydata();
 //BA.debugLineNum = 89;BA.debugLine="DrawerSupplierClv";
_drawersupplierclv();
 //BA.debugLineNum = 90;BA.debugLine="MainCLV";
_mainclv();
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 104;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setHomeA";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHomeAsUpIndicator",new Object[]{(Object)(0)});
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Private Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 151;BA.debugLine="If Tag = \"Supplier\" Then";
if ((_tag).equals("Supplier")) { 
 //BA.debugLineNum = 152;BA.debugLine="PanelSupplier.Visible = True";
_panelsupplier.setVisible(__c.True);
 //BA.debugLineNum = 153;BA.debugLine="B4XPages.SetTitle(Me,\"Supplier\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Supplier"));
 }else if((_tag).equals("Item")) { 
 //BA.debugLineNum = 155;BA.debugLine="PanelSupplier.Visible = False";
_panelsupplier.setVisible(__c.False);
 //BA.debugLineNum = 156;BA.debugLine="B4XPages.SetTitle(Me,\"School supplies\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("School supplies"));
 };
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 123;BA.debugLine="Drawer.Resize(Width, Height)";
_drawer._resize /*String*/ (_width,_height);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _buttoncancel_click() throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Private Sub ButtonCancel_Click";
 //BA.debugLineNum = 566;BA.debugLine="MenuPanel3.Visible = False";
_menupanel3.setVisible(__c.False);
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private ip As String = \"\"";
_ip = "";
 //BA.debugLineNum = 12;BA.debugLine="Private itemlist As B4XView";
_itemlist = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Drawer As B4XDrawer";
_drawer = new b4a.example.b4xdrawer();
 //BA.debugLineNum = 15;BA.debugLine="Private HamburgerIcon As B4XBitmap";
_hamburgericon = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public MainMenuClv As CustomListView";
_mainmenuclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 18;BA.debugLine="Public temp_suppItem, temp_Itemname, temp_ItemDes";
_temp_suppitem = "";
_temp_itemname = "";
_temp_itemdesc = "";
_temp_itemno = "";
_temp_itemunit = "";
_temp_itemquantity = "";
_temp_ucost = "";
_temp_itemtotalcost = "";
 //BA.debugLineNum = 19;BA.debugLine="Public tempSuppname, tempItemname, tempItemDesc,";
_tempsuppname = "";
_tempitemname = "";
_tempitemdesc = "";
_tempitemno = "";
_tempitemunit = "";
_tempitemquantity = "";
_tempucost = "";
_tempitemtotalcost = "";
 //BA.debugLineNum = 20;BA.debugLine="Public temp_Suppname, temp_Address, temp_tin, tem";
_temp_suppname = "";
_temp_address = "";
_temp_tin = "";
_temp_pono = "";
_temp_date = "";
_temp_mop = "";
_temp_pod = "";
_temp_dod = "";
_temp_delterm = "";
_temp_payterm = "";
_temp_note = "";
 //BA.debugLineNum = 22;BA.debugLine="Public pageAddItem As AddItemPage";
_pageadditem = new b4a.example.additempage();
 //BA.debugLineNum = 23;BA.debugLine="Public pageEditItem As editItemPage";
_pageedititem = new b4a.example.edititempage();
 //BA.debugLineNum = 24;BA.debugLine="Public pageAddSupplier As AddSupplierPage";
_pageaddsupplier = new b4a.example.addsupplierpage();
 //BA.debugLineNum = 25;BA.debugLine="Public editSupplier As editSupplierPage";
_editsupplier = new b4a.example.editsupplierpage();
 //BA.debugLineNum = 27;BA.debugLine="Private SupplierListCLV As CustomListView";
_supplierlistclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 28;BA.debugLine="Private NoItemLabel As Label";
_noitemlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private itemNameHolder As Label";
_itemnameholder = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private QuantityHolder As Label";
_quantityholder = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private SuuplierCountLabel As Label";
_suupliercountlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private ItemCountLabel As Label";
_itemcountlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private sam As String";
_sam = "";
 //BA.debugLineNum = 36;BA.debugLine="Private Search As EditText";
_search = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Public SupplierHolder As Label";
_supplierholder = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private NoSupplierlbl As Label";
_nosupplierlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Public pSupplier As B4XView";
_psupplier = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Public Suppliers As B4XView";
_suppliers = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private MenuPanel3 As Panel";
_menupanel3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Public sams As String";
_sams = "";
 //BA.debugLineNum = 45;BA.debugLine="Private MainSupplierClv As CustomListView";
_mainsupplierclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 46;BA.debugLine="Private PanelSupplier As Panel";
_panelsupplier = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private MainSupplierHolder As Label";
_mainsupplierholder = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public void  _deleteitem() throws Exception{
ResumableSub_DeleteItem rsub = new ResumableSub_DeleteItem(this);
rsub.resume(ba, null);
}
public static class ResumableSub_DeleteItem extends BA.ResumableSub {
public ResumableSub_DeleteItem(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
Object _sf = null;
int _result = 0;
b4a.example.httpjob _deleteitemclicked = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 584;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Delete Item?";
_sf = parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("Delete Item?"),BA.ObjectToCharSequence(""),"Delete","Cancel","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
 //BA.debugLineNum = 585;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 586;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 587;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 //BA.debugLineNum = 588;BA.debugLine="Log(\"item to DELETE: \"& sam)";
parent.__c.LogImpl("22097157","item to DELETE: "+parent._sam,0);
 //BA.debugLineNum = 589;BA.debugLine="Dim DeleteItemclicked As HttpJob";
_deleteitemclicked = new b4a.example.httpjob();
 //BA.debugLineNum = 590;BA.debugLine="DeleteItemclicked.Initialize(\"DeleteCLickedItem\"";
_deleteitemclicked._initialize /*String*/ (ba,"DeleteCLickedItem",parent);
 //BA.debugLineNum = 591;BA.debugLine="DeleteItemclicked.download2(\"http://\" & ip & \"/i";
_deleteitemclicked._download2 /*String*/ ("http://"+parent._ip+"/inventory/inventory_API.php",new String[]{"action","DeleteItem","passedDataDelete",parent._sam});
 //BA.debugLineNum = 592;BA.debugLine="DisplayData";
parent._displaydata();
 //BA.debugLineNum = 593;BA.debugLine="ToastMessageShow(\"Item Deleted\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Item Deleted"),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public void  _deletesupplier() throws Exception{
ResumableSub_DeleteSupplier rsub = new ResumableSub_DeleteSupplier(this);
rsub.resume(ba, null);
}
public static class ResumableSub_DeleteSupplier extends BA.ResumableSub {
public ResumableSub_DeleteSupplier(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
Object _sf = null;
int _result = 0;
b4a.example.httpjob _deletesupplierclicked = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 570;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Delete Suppl";
_sf = parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("Delete Supplier?"),BA.ObjectToCharSequence(""),"Delete","Cancel","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
 //BA.debugLineNum = 571;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 572;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 573;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 //BA.debugLineNum = 574;BA.debugLine="Log(\"Supplier to DELETE: \"& sam)";
parent.__c.LogImpl("220905989","Supplier to DELETE: "+parent._sam,0);
 //BA.debugLineNum = 575;BA.debugLine="Dim DeleteSupplierclicked As HttpJob";
_deletesupplierclicked = new b4a.example.httpjob();
 //BA.debugLineNum = 576;BA.debugLine="DeleteSupplierclicked.Initialize(\"DeleteCLickedS";
_deletesupplierclicked._initialize /*String*/ (ba,"DeleteCLickedSupplier",parent);
 //BA.debugLineNum = 577;BA.debugLine="DeleteSupplierclicked.download2(\"http://\" & ip &";
_deletesupplierclicked._download2 /*String*/ ("http://"+parent._ip+"/inventory/inventory_API.php",new String[]{"action","DeleteSupplier"," passedSupplierDelete",parent._sam});
 //BA.debugLineNum = 578;BA.debugLine="DisplayData";
parent._displaydata();
 //BA.debugLineNum = 579;BA.debugLine="ToastMessageShow(\"Supplier Deleted\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Supplier Deleted"),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _displaydata() throws Exception{
b4a.example.httpjob _countitemtotalcost = null;
b4a.example.httpjob _countitem = null;
b4a.example.httpjob _getpersons = null;
b4a.example.httpjob _getsupplier = null;
b4a.example.httpjob _getsuppliermain = null;
 //BA.debugLineNum = 179;BA.debugLine="Public Sub DisplayData";
 //BA.debugLineNum = 181;BA.debugLine="MainMenuClv.Clear";
_mainmenuclv._clear();
 //BA.debugLineNum = 182;BA.debugLine="Try";
try { //BA.debugLineNum = 184;BA.debugLine="Dim CountitemTotalCost As HttpJob";
_countitemtotalcost = new b4a.example.httpjob();
 //BA.debugLineNum = 185;BA.debugLine="CountitemTotalCost.Initialize(\"CountitemTotalCos";
_countitemtotalcost._initialize /*String*/ (ba,"CountitemTotalCost",this);
 //BA.debugLineNum = 186;BA.debugLine="CountitemTotalCost.download2(\"http://\" & ip & \"/";
_countitemtotalcost._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","GetTotalCost"});
 //BA.debugLineNum = 189;BA.debugLine="Dim Countitem As HttpJob";
_countitem = new b4a.example.httpjob();
 //BA.debugLineNum = 190;BA.debugLine="Countitem.Initialize(\"Countitem\", Me)";
_countitem._initialize /*String*/ (ba,"Countitem",this);
 //BA.debugLineNum = 191;BA.debugLine="Countitem.download2(\"http://\" & ip & \"/inventory";
_countitem._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","CountItem"});
 //BA.debugLineNum = 193;BA.debugLine="Dim Countitem As HttpJob";
_countitem = new b4a.example.httpjob();
 //BA.debugLineNum = 194;BA.debugLine="Countitem.Initialize(\"Countsupplier\", Me)";
_countitem._initialize /*String*/ (ba,"Countsupplier",this);
 //BA.debugLineNum = 195;BA.debugLine="Countitem.download2(\"http://\" & ip & \"/inventory";
_countitem._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","CountSupplier"});
 //BA.debugLineNum = 198;BA.debugLine="Dim GetPersons As HttpJob";
_getpersons = new b4a.example.httpjob();
 //BA.debugLineNum = 199;BA.debugLine="GetPersons.Initialize(\"Getitem\", Me)";
_getpersons._initialize /*String*/ (ba,"Getitem",this);
 //BA.debugLineNum = 200;BA.debugLine="GetPersons.download2(\"http://\" & ip & \"/inventor";
_getpersons._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","GetItem"});
 //BA.debugLineNum = 203;BA.debugLine="Dim Getsupplier As HttpJob";
_getsupplier = new b4a.example.httpjob();
 //BA.debugLineNum = 204;BA.debugLine="Getsupplier.Initialize(\"Getsupplier\", Me)";
_getsupplier._initialize /*String*/ (ba,"Getsupplier",this);
 //BA.debugLineNum = 205;BA.debugLine="Getsupplier.download2(\"http://\" & ip & \"/invento";
_getsupplier._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","GetSupplier"});
 //BA.debugLineNum = 208;BA.debugLine="Dim GetsupplierMain As HttpJob";
_getsuppliermain = new b4a.example.httpjob();
 //BA.debugLineNum = 209;BA.debugLine="GetsupplierMain.Initialize(\"GetsupplierMain\", Me";
_getsuppliermain._initialize /*String*/ (ba,"GetsupplierMain",this);
 //BA.debugLineNum = 210;BA.debugLine="GetsupplierMain.download2(\"http://\" & ip & \"/inv";
_getsuppliermain._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","GetSupplierMain"});
 } 
       catch (Exception e22) {
			ba.setLastException(e22); //BA.debugLineNum = 212;BA.debugLine="Log(LastException)";
__c.LogImpl("21441825",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _drawersupplierclv() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 142;BA.debugLine="Private Sub DrawerSupplierClv";
 //BA.debugLineNum = 144;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 145;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,70dip)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 146;BA.debugLine="p.LoadLayout(\"displaysupplier\")";
_p.LoadLayout("displaysupplier",ba);
 //BA.debugLineNum = 147;BA.debugLine="SupplierListCLV.Add(p,\"\")";
_supplierlistclv._add(_p,(Object)(""));
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _insertdata(String _supplier,String _item_name,String _item_description,int _item_no,String _item_unit,int _item_quantity,int _item_unitcost,String _item_totalcost) throws Exception{
b4a.example.httpjob _insertitem = null;
 //BA.debugLineNum = 217;BA.debugLine="Public Sub Insertdata(supplier As String, item_Nam";
 //BA.debugLineNum = 220;BA.debugLine="Dim InsertItem As HttpJob";
_insertitem = new b4a.example.httpjob();
 //BA.debugLineNum = 221;BA.debugLine="InsertItem.Initialize(\"InsertItem\", Me)";
_insertitem._initialize /*String*/ (ba,"InsertItem",this);
 //BA.debugLineNum = 222;BA.debugLine="InsertItem.download2(\"http://\" & ip & \"/inventory";
_insertitem._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","InsertNewItem","supplier",_supplier,"item_name",_item_name,"item_description",_item_description,"item_no",BA.NumberToString(_item_no),"item_unit",_item_unit,"item_quantity",BA.NumberToString(_item_quantity),"item_unitcost",BA.NumberToString(_item_unitcost),"item_totalcost",_item_totalcost});
 //BA.debugLineNum = 225;BA.debugLine="DisplayData";
_displaydata();
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _insertsupplier(String _supplier_name,String _supplier_address,int _supplier_tin,String _supplier_pno,String _supplier_date,String _supplier_mop,String _supplier_pod,String _supplier_dod,String _supplier_dt,String _supplier_pt) throws Exception{
b4a.example.httpjob _insertsupp = null;
 //BA.debugLineNum = 228;BA.debugLine="Public Sub InsertSupplier(supplier_Name As String,";
 //BA.debugLineNum = 231;BA.debugLine="Dim InsertSupp As HttpJob";
_insertsupp = new b4a.example.httpjob();
 //BA.debugLineNum = 232;BA.debugLine="InsertSupp.Initialize(\"InsertSupp\", Me)";
_insertsupp._initialize /*String*/ (ba,"InsertSupp",this);
 //BA.debugLineNum = 233;BA.debugLine="InsertSupp.download2(\"http://\" & ip & \"/inventory";
_insertsupp._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","InsertNewSupp","supplier_name",_supplier_name,"supplier_address",_supplier_address,"supplier_tin",BA.NumberToString(_supplier_tin),"supplier_pno",_supplier_pno,"supplier_date",_supplier_date,"supplier_mop",_supplier_mop,"supplier_PoD",_supplier_pod,"supplier_DoD",_supplier_dod,"supplier_DT",_supplier_dt,"supplier_PT",_supplier_pt});
 //BA.debugLineNum = 237;BA.debugLine="DisplayData";
_displaydata();
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.example.httpjob _job) throws Exception{
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _listofitems = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itemname = "";
 //BA.debugLineNum = 264;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 265;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 266;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 267;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 268;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ ();
 //BA.debugLineNum = 269;BA.debugLine="Log(\"Back from Job:\" & Job.JobName)";
__c.LogImpl("21769477","Back from Job:"+_job._jobname /*String*/ ,0);
 //BA.debugLineNum = 270;BA.debugLine="Log(\"Response from server: \" & res)";
__c.LogImpl("21769478","Response from server: "+_res,0);
 //BA.debugLineNum = 272;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 273;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 275;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"Getitem","Getsupplier","GetsupplierMain","Countitem","Countsupplier","GetsupplierID","InsertItem","InsertSupp","Updateitem","UpdateSupply","DeleteCLickedItem","DeleteCLickedSupplier","ViewCLickedItem","ViewCLickedSupplier","SearchItem")) {
case 0: {
 //BA.debugLineNum = 278;BA.debugLine="Dim ListOfItems As List";
_listofitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 279;BA.debugLine="ListOfItems = parser.NextArray 'returns a list";
_listofitems = _parser.NextArray();
 //BA.debugLineNum = 281;BA.debugLine="MainMenuClv.Clear";
_mainmenuclv._clear();
 //BA.debugLineNum = 283;BA.debugLine="If ListOfItems.Size = 0 Then";
if (_listofitems.getSize()==0) { 
 //BA.debugLineNum = 284;BA.debugLine="NoItemLabel.Visible = True";
_noitemlabel.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 286;BA.debugLine="NoItemLabel.Visible = False";
_noitemlabel.setVisible(__c.False);
 //BA.debugLineNum = 287;BA.debugLine="For i = 0 To ListOfItems.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (_listofitems.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 288;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 289;BA.debugLine="item = ListOfItems.Get(i)";
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofitems.Get(_i)));
 //BA.debugLineNum = 292;BA.debugLine="itemlist = xui.CreatePanel(\"\")";
_itemlist = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 293;BA.debugLine="itemlist.SetLayoutAnimated(100, 0, 0, 100%x,";
_itemlist.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 294;BA.debugLine="itemlist.LoadLayout(\"itemDisplay\")";
_itemlist.LoadLayout("itemDisplay",ba);
 //BA.debugLineNum = 295;BA.debugLine="MainMenuClv.Add(itemlist, \"\")";
_mainmenuclv._add(_itemlist,(Object)(""));
 //BA.debugLineNum = 298;BA.debugLine="itemNameHolder.Text = item.Get(\"item_name\")";
_itemnameholder.setText(BA.ObjectToCharSequence(_item.Get((Object)("item_name"))));
 //BA.debugLineNum = 299;BA.debugLine="QuantityHolder.Text = item.Get(\"item_quantit";
_quantityholder.setText(BA.ObjectToCharSequence(_item.Get((Object)("item_quantity"))));
 }
};
 };
 break; }
case 1: {
 //BA.debugLineNum = 306;BA.debugLine="Dim ListOfItems As List";
_listofitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 307;BA.debugLine="ListOfItems = parser.NextArray 'returns a list";
_listofitems = _parser.NextArray();
 //BA.debugLineNum = 309;BA.debugLine="SupplierListCLV.Clear";
_supplierlistclv._clear();
 //BA.debugLineNum = 311;BA.debugLine="If ListOfItems.Size = 0 Then";
if (_listofitems.getSize()==0) { 
 //BA.debugLineNum = 312;BA.debugLine="NoSupplierlbl.Visible = True";
_nosupplierlbl.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 314;BA.debugLine="NoSupplierlbl.Visible = False";
_nosupplierlbl.setVisible(__c.False);
 //BA.debugLineNum = 315;BA.debugLine="For i = 0 To ListOfItems.Size - 1";
{
final int step37 = 1;
final int limit37 = (int) (_listofitems.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
 //BA.debugLineNum = 316;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 317;BA.debugLine="item = ListOfItems.Get(i)";
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofitems.Get(_i)));
 //BA.debugLineNum = 319;BA.debugLine="pSupplier = xui.CreatePanel(\"\")";
_psupplier = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 320;BA.debugLine="pSupplier.SetLayoutAnimated(100,0,0,100%x,50";
_psupplier.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 321;BA.debugLine="pSupplier.LoadLayout(\"displaysupplier\")";
_psupplier.LoadLayout("displaysupplier",ba);
 //BA.debugLineNum = 322;BA.debugLine="SupplierListCLV.Add(pSupplier,\"\")";
_supplierlistclv._add(_psupplier,(Object)(""));
 //BA.debugLineNum = 324;BA.debugLine="SupplierHolder.Text = item.Get(\"supplier_nam";
_supplierholder.setText(BA.ObjectToCharSequence(_item.Get((Object)("supplier_name"))));
 }
};
 };
 break; }
case 2: {
 //BA.debugLineNum = 332;BA.debugLine="Dim ListOfItems As List";
_listofitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 333;BA.debugLine="ListOfItems = parser.NextArray 'returns a list";
_listofitems = _parser.NextArray();
 //BA.debugLineNum = 335;BA.debugLine="MainSupplierClv.Clear";
_mainsupplierclv._clear();
 //BA.debugLineNum = 337;BA.debugLine="If ListOfItems.Size = 0 Then";
if (_listofitems.getSize()==0) { 
 //BA.debugLineNum = 338;BA.debugLine="NoSupplierlbl.Visible = True";
_nosupplierlbl.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 340;BA.debugLine="NoSupplierlbl.Visible = False";
_nosupplierlbl.setVisible(__c.False);
 //BA.debugLineNum = 341;BA.debugLine="For i = 0 To ListOfItems.Size - 1";
{
final int step55 = 1;
final int limit55 = (int) (_listofitems.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
 //BA.debugLineNum = 342;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 343;BA.debugLine="item = ListOfItems.Get(i)";
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofitems.Get(_i)));
 //BA.debugLineNum = 345;BA.debugLine="Suppliers = xui.CreatePanel(\"\")";
_suppliers = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 346;BA.debugLine="Suppliers.SetLayoutAnimated(100,0,0,100%x,50";
_suppliers.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 347;BA.debugLine="Suppliers.LoadLayout(\"displaySupplierOnMain\"";
_suppliers.LoadLayout("displaySupplierOnMain",ba);
 //BA.debugLineNum = 348;BA.debugLine="MainSupplierClv.Add(Suppliers,\"\")";
_mainsupplierclv._add(_suppliers,(Object)(""));
 //BA.debugLineNum = 350;BA.debugLine="MainSupplierHolder.Text = item.Get(\"supplier";
_mainsupplierholder.setText(BA.ObjectToCharSequence(_item.Get((Object)("supplier_name"))));
 }
};
 };
 break; }
case 3: {
 //BA.debugLineNum = 359;BA.debugLine="ItemCountLabel.Text = parser.NextValue";
_itemcountlabel.setText(BA.ObjectToCharSequence(_parser.NextValue()));
 break; }
case 4: {
 //BA.debugLineNum = 363;BA.debugLine="SuuplierCountLabel.Text = parser.NextValue";
_suupliercountlabel.setText(BA.ObjectToCharSequence(_parser.NextValue()));
 break; }
case 5: {
 break; }
case 6: {
 break; }
case 7: {
 break; }
case 8: {
 break; }
case 9: {
 break; }
case 10: {
 break; }
case 11: {
 break; }
case 12: {
 //BA.debugLineNum = 409;BA.debugLine="Dim ListOfItems As List";
_listofitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 410;BA.debugLine="ListOfItems = parser.NextArray 'returns a list";
_listofitems = _parser.NextArray();
 //BA.debugLineNum = 412;BA.debugLine="MainMenuClv.Clear";
_mainmenuclv._clear();
 //BA.debugLineNum = 414;BA.debugLine="If ListOfItems.Size = 0 Then";
if (_listofitems.getSize()==0) { 
 //BA.debugLineNum = 415;BA.debugLine="NoItemLabel.Visible = True";
_noitemlabel.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 417;BA.debugLine="For i = 0 To ListOfItems.Size - 1";
{
final int step83 = 1;
final int limit83 = (int) (_listofitems.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit83 ;_i = _i + step83 ) {
 //BA.debugLineNum = 418;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 419;BA.debugLine="item = ListOfItems.Get(i)";
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofitems.Get(_i)));
 //BA.debugLineNum = 421;BA.debugLine="temp_suppItem = item.Get(\"supplier\")";
_temp_suppitem = BA.ObjectToString(_item.Get((Object)("supplier")));
 //BA.debugLineNum = 422;BA.debugLine="temp_Itemname = item.Get(\"item_name\")";
_temp_itemname = BA.ObjectToString(_item.Get((Object)("item_name")));
 //BA.debugLineNum = 423;BA.debugLine="temp_ItemDesc = item.Get(\"item_description\")";
_temp_itemdesc = BA.ObjectToString(_item.Get((Object)("item_description")));
 //BA.debugLineNum = 424;BA.debugLine="temp_ItemNo  = item.Get(\"item_no\")";
_temp_itemno = BA.ObjectToString(_item.Get((Object)("item_no")));
 //BA.debugLineNum = 425;BA.debugLine="temp_ItemUnit = item.Get(\"item_unit\")";
_temp_itemunit = BA.ObjectToString(_item.Get((Object)("item_unit")));
 //BA.debugLineNum = 426;BA.debugLine="temp_ItemQuantity = item.Get(\"item_quantity\"";
_temp_itemquantity = BA.ObjectToString(_item.Get((Object)("item_quantity")));
 //BA.debugLineNum = 427;BA.debugLine="temp_UCost = item.Get(\"item_unitcost\")";
_temp_ucost = BA.ObjectToString(_item.Get((Object)("item_unitcost")));
 //BA.debugLineNum = 428;BA.debugLine="temp_ItemTotalCost = item.Get(\"item_totalcos";
_temp_itemtotalcost = BA.ObjectToString(_item.Get((Object)("item_totalcost")));
 //BA.debugLineNum = 430;BA.debugLine="Log(\"Edit item data: \" & temp_Itemname)";
__c.LogImpl("21769638","Edit item data: "+_temp_itemname,0);
 }
};
 };
 //BA.debugLineNum = 434;BA.debugLine="B4XPages.ShowPage(\"editItemPage\")";
_b4xpages._showpage /*String*/ (ba,"editItemPage");
 //BA.debugLineNum = 435;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuratio";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 break; }
case 13: {
 //BA.debugLineNum = 438;BA.debugLine="Dim ListOfItems As List";
_listofitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 439;BA.debugLine="ListOfItems = parser.NextArray 'returns a list";
_listofitems = _parser.NextArray();
 //BA.debugLineNum = 441;BA.debugLine="MainSupplierClv.Clear";
_mainsupplierclv._clear();
 //BA.debugLineNum = 443;BA.debugLine="If ListOfItems.Size = 0 Then";
if (_listofitems.getSize()==0) { 
 //BA.debugLineNum = 444;BA.debugLine="NoItemLabel.Visible = True";
_noitemlabel.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 446;BA.debugLine="For i = 0 To ListOfItems.Size - 1";
{
final int step106 = 1;
final int limit106 = (int) (_listofitems.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit106 ;_i = _i + step106 ) {
 //BA.debugLineNum = 447;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 448;BA.debugLine="item = ListOfItems.Get(i)";
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofitems.Get(_i)));
 //BA.debugLineNum = 452;BA.debugLine="temp_Suppname = item.Get(\"supplier_name\")";
_temp_suppname = BA.ObjectToString(_item.Get((Object)("supplier_name")));
 //BA.debugLineNum = 453;BA.debugLine="temp_Address = item.Get(\"supplier_address\")";
_temp_address = BA.ObjectToString(_item.Get((Object)("supplier_address")));
 //BA.debugLineNum = 454;BA.debugLine="temp_tin = item.Get(\"supplier_tin\")";
_temp_tin = BA.ObjectToString(_item.Get((Object)("supplier_tin")));
 //BA.debugLineNum = 455;BA.debugLine="temp_PONo  = item.Get(\"supplier_pno\")";
_temp_pono = BA.ObjectToString(_item.Get((Object)("supplier_pno")));
 //BA.debugLineNum = 456;BA.debugLine="temp_date = item.Get(\"supplier_date\")";
_temp_date = BA.ObjectToString(_item.Get((Object)("supplier_date")));
 //BA.debugLineNum = 457;BA.debugLine="temp_MOP = item.Get(\"supplier_mop\")";
_temp_mop = BA.ObjectToString(_item.Get((Object)("supplier_mop")));
 //BA.debugLineNum = 458;BA.debugLine="temp_POD = item.Get(\"supplier_PoD\")";
_temp_pod = BA.ObjectToString(_item.Get((Object)("supplier_PoD")));
 //BA.debugLineNum = 459;BA.debugLine="temp_DOD = item.Get(\"supplier_DoD\")";
_temp_dod = BA.ObjectToString(_item.Get((Object)("supplier_DoD")));
 //BA.debugLineNum = 460;BA.debugLine="temp_DelTerm = item.Get(\"supplier_DT\")";
_temp_delterm = BA.ObjectToString(_item.Get((Object)("supplier_DT")));
 //BA.debugLineNum = 461;BA.debugLine="temp_PayTerm = item.Get(\"supplier_PT\")";
_temp_payterm = BA.ObjectToString(_item.Get((Object)("supplier_PT")));
 //BA.debugLineNum = 463;BA.debugLine="Log(\"Edit item data: \" & temp_Itemname)";
__c.LogImpl("21769671","Edit item data: "+_temp_itemname,0);
 }
};
 };
 //BA.debugLineNum = 467;BA.debugLine="B4XPages.ShowPage(\"editSupplierPage\")";
_b4xpages._showpage /*String*/ (ba,"editSupplierPage");
 //BA.debugLineNum = 468;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuratio";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 break; }
case 14: {
 //BA.debugLineNum = 471;BA.debugLine="Dim ListOfItems As List";
_listofitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 472;BA.debugLine="ListOfItems = parser.NextArray 'returns a list";
_listofitems = _parser.NextArray();
 //BA.debugLineNum = 474;BA.debugLine="If ListOfItems.Size = 0 Then";
if (_listofitems.getSize()==0) { 
 //BA.debugLineNum = 475;BA.debugLine="NoItemLabel.Visible = True";
_noitemlabel.setVisible(__c.True);
 //BA.debugLineNum = 476;BA.debugLine="NoItemLabel.Text = \"No Item Found\"";
_noitemlabel.setText(BA.ObjectToCharSequence("No Item Found"));
 }else {
 //BA.debugLineNum = 479;BA.debugLine="For i = 0 To ListOfItems.Size - 1";
{
final int step131 = 1;
final int limit131 = (int) (_listofitems.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit131 ;_i = _i + step131 ) {
 //BA.debugLineNum = 480;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 481;BA.debugLine="item = ListOfItems.Get(i)";
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofitems.Get(_i)));
 //BA.debugLineNum = 482;BA.debugLine="Dim ItemName As String = item.Get(\"item_name";
_itemname = BA.ObjectToString(_item.Get((Object)("item_name")));
 //BA.debugLineNum = 483;BA.debugLine="If Search.text.Length = 0 Or ItemName.ToLowe";
if (_search.getText().length()==0 || _itemname.toLowerCase().contains(_search.getText().toLowerCase())) { 
 //BA.debugLineNum = 485;BA.debugLine="PanelSupplier.Visible = False";
_panelsupplier.setVisible(__c.False);
 //BA.debugLineNum = 488;BA.debugLine="itemlist = xui.CreatePanel(\"\")";
_itemlist = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 489;BA.debugLine="itemlist.SetLayoutAnimated(100, 0, 0, 100%x";
_itemlist.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 490;BA.debugLine="itemlist.LoadLayout(\"itemDisplay\")";
_itemlist.LoadLayout("itemDisplay",ba);
 //BA.debugLineNum = 491;BA.debugLine="MainMenuClv.Add(itemlist, \"\")";
_mainmenuclv._add(_itemlist,(Object)(""));
 //BA.debugLineNum = 494;BA.debugLine="itemNameHolder.Text = item.Get(\"item_name\")";
_itemnameholder.setText(BA.ObjectToCharSequence(_item.Get((Object)("item_name"))));
 //BA.debugLineNum = 495;BA.debugLine="QuantityHolder.Text = item.Get(\"item_quanti";
_quantityholder.setText(BA.ObjectToCharSequence(_item.Get((Object)("item_quantity"))));
 //BA.debugLineNum = 497;BA.debugLine="NoItemLabel.Visible = True";
_noitemlabel.setVisible(__c.True);
 //BA.debugLineNum = 498;BA.debugLine="NoItemLabel.Text = \"No More Item Found\"";
_noitemlabel.setText(BA.ObjectToCharSequence("No More Item Found"));
 }else {
 //BA.debugLineNum = 500;BA.debugLine="NoItemLabel.Visible = True";
_noitemlabel.setVisible(__c.True);
 //BA.debugLineNum = 501;BA.debugLine="NoItemLabel.Text = \"No Item Found\"";
_noitemlabel.setText(BA.ObjectToCharSequence("No Item Found"));
 };
 }
};
 };
 break; }
}
;
 }else {
 //BA.debugLineNum = 508;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage /*String*/ ),__c.True);
 };
 //BA.debugLineNum = 510;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return "";
}
public String  _mainclv() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _q = null;
 //BA.debugLineNum = 159;BA.debugLine="Private Sub MainCLV";
 //BA.debugLineNum = 161;BA.debugLine="Dim q As B4XView = xui.CreatePanel(\"\")";
_q = new anywheresoftware.b4a.objects.B4XViewWrapper();
_q = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 162;BA.debugLine="q.SetLayoutAnimated(100,0,0,100%x,70dip)";
_q.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 163;BA.debugLine="q.LoadLayout(\"itemDisplay\")";
_q.LoadLayout("itemDisplay",ba);
 //BA.debugLineNum = 164;BA.debugLine="SupplierListCLV.Add(q,\"\")";
_supplierlistclv._add(_q,(Object)(""));
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public void  _mainmenuclv_itemclick(int _index,Object _value) throws Exception{
ResumableSub_MainMenuClv_ItemClick rsub = new ResumableSub_MainMenuClv_ItemClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_MainMenuClv_ItemClick extends BA.ResumableSub {
public ResumableSub_MainMenuClv_ItemClick(b4a.example.b4xmainpage parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.example.b4xmainpage parent;
int _index;
Object _value;
b4a.example.httpjob _viewitemclicked = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 514;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 515;BA.debugLine="itemlist = MainMenuClv.GetPanel(Index).GetView(0)";
parent._itemlist = parent._mainmenuclv._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 516;BA.debugLine="sam = itemlist.GetView(0).Text           'lblTitl";
parent._sam = parent._itemlist.GetView((int) (0)).getText();
 //BA.debugLineNum = 517;BA.debugLine="Log(\"CLicked: \"& sam)";
parent.__c.LogImpl("21835012","CLicked: "+parent._sam,0);
 //BA.debugLineNum = 521;BA.debugLine="Dim viewItemclicked As HttpJob";
_viewitemclicked = new b4a.example.httpjob();
 //BA.debugLineNum = 522;BA.debugLine="viewItemclicked.Initialize(\"ViewCLickedItem\", Me)";
_viewitemclicked._initialize /*String*/ (ba,"ViewCLickedItem",parent);
 //BA.debugLineNum = 523;BA.debugLine="viewItemclicked.download2(\"http://\" & ip & \"/inve";
_viewitemclicked._download2 /*String*/ ("http://"+parent._ip+"/inventory/inventory_API.php",new String[]{"action","ViewItem","passedData",parent._sam});
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mainsupplierclv_itemclick(int _index,Object _value) throws Exception{
ResumableSub_MainSupplierClv_ItemClick rsub = new ResumableSub_MainSupplierClv_ItemClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_MainSupplierClv_ItemClick extends BA.ResumableSub {
public ResumableSub_MainSupplierClv_ItemClick(b4a.example.b4xmainpage parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.example.b4xmainpage parent;
int _index;
Object _value;
b4a.example.httpjob _viewsupplierclicked = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 528;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 529;BA.debugLine="itemlist = MainSupplierClv.GetPanel(Index).GetVie";
parent._itemlist = parent._mainsupplierclv._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 530;BA.debugLine="sam = itemlist.GetView(0).Text           'lblTitl";
parent._sam = parent._itemlist.GetView((int) (0)).getText();
 //BA.debugLineNum = 531;BA.debugLine="Log(\"Clicked Supplier: \"& sam)";
parent.__c.LogImpl("22031620","Clicked Supplier: "+parent._sam,0);
 //BA.debugLineNum = 533;BA.debugLine="Dim viewSupplierclicked As HttpJob";
_viewsupplierclicked = new b4a.example.httpjob();
 //BA.debugLineNum = 534;BA.debugLine="viewSupplierclicked.Initialize(\"ViewCLickedSuppli";
_viewsupplierclicked._initialize /*String*/ (ba,"ViewCLickedSupplier",parent);
 //BA.debugLineNum = 535;BA.debugLine="viewSupplierclicked.download2(\"http://\" & ip & \"/";
_viewsupplierclicked._download2 /*String*/ ("http://"+parent._ip+"/inventory/inventory_API.php",new String[]{"action","ViewSupplier","passedSupplier",parent._sam});
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _search_textchanged(String _old,String _new) throws Exception{
b4a.example.httpjob _searchitemname = null;
 //BA.debugLineNum = 550;BA.debugLine="Private Sub Search_TextChanged (Old As String, New";
 //BA.debugLineNum = 551;BA.debugLine="MainMenuClv.Clear";
_mainmenuclv._clear();
 //BA.debugLineNum = 552;BA.debugLine="If New.Length = 0 Then";
if (_new.length()==0) { 
 //BA.debugLineNum = 554;BA.debugLine="DisplayData";
_displaydata();
 //BA.debugLineNum = 555;BA.debugLine="PanelSupplier.Visible = False";
_panelsupplier.setVisible(__c.False);
 }else {
 //BA.debugLineNum = 557;BA.debugLine="PanelSupplier.Visible = False";
_panelsupplier.setVisible(__c.False);
 //BA.debugLineNum = 558;BA.debugLine="Dim SearchItemName As HttpJob";
_searchitemname = new b4a.example.httpjob();
 //BA.debugLineNum = 559;BA.debugLine="SearchItemName.Initialize(\"SearchItem\", Me)";
_searchitemname._initialize /*String*/ (ba,"SearchItem",this);
 //BA.debugLineNum = 560;BA.debugLine="SearchItemName.download2(\"http://\" & ip & \"/inve";
_searchitemname._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","SearchedItem"});
 };
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return "";
}
public String  _setactionbarcolor(int _color) throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4j.object.JavaObject _window = null;
 //BA.debugLineNum = 125;BA.debugLine="Public Sub SetActionBarColor(Color As Int)";
 //BA.debugLineNum = 126;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 127;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 128;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
 //BA.debugLineNum = 129;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 130;BA.debugLine="cd.Initialize(Color, 0)";
_cd.Initialize(_color,(int) (0));
 //BA.debugLineNum = 131;BA.debugLine="jo.RunMethodJO(\"getActionBar\", Null).RunMethod(\"s";
_jo.RunMethodJO("getActionBar",(Object[])(__c.Null)).RunMethod("setBackgroundDrawable",new Object[]{(Object)(_cd.getObject())});
 //BA.debugLineNum = 133;BA.debugLine="If p.SdkVersion >= 21 Then";
if (_p.getSdkVersion()>=21) { 
 //BA.debugLineNum = 134;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 135;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
 //BA.debugLineNum = 136;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
 //BA.debugLineNum = 137;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
 //BA.debugLineNum = 138;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
 //BA.debugLineNum = 139;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(Colo";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_color)});
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public void  _supplierlistclv_itemclick(int _index,Object _value) throws Exception{
ResumableSub_SupplierListCLV_ItemClick rsub = new ResumableSub_SupplierListCLV_ItemClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SupplierListCLV_ItemClick extends BA.ResumableSub {
public ResumableSub_SupplierListCLV_ItemClick(b4a.example.b4xmainpage parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.example.b4xmainpage parent;
int _index;
Object _value;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 540;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 541;BA.debugLine="itemlist = SupplierListCLV.GetPanel(Index).GetVie";
parent._itemlist = parent._supplierlistclv._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 542;BA.debugLine="sams = itemlist.GetView(0).Text           'lblTit";
parent._sams = parent._itemlist.GetView((int) (0)).getText();
 //BA.debugLineNum = 543;BA.debugLine="Log(\"sams: \"& sams)";
parent.__c.LogImpl("21900548","sams: "+parent._sams,0);
 //BA.debugLineNum = 545;BA.debugLine="MenuPanel3.Visible = False";
parent._menupanel3.setVisible(parent.__c.False);
 //BA.debugLineNum = 546;BA.debugLine="B4XPages.ShowPage(\"ItemAddPage\")";
parent._b4xpages._showpage /*String*/ (ba,"ItemAddPage");
 //BA.debugLineNum = 547;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
parent._b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _updatedata(String _itemsupplier,String _item_name,String _item_description,int _item_no,String _item_unit,int _item_quantity,int _item_unitcost,String _item_totalcost) throws Exception{
b4a.example.httpjob _updateitem = null;
 //BA.debugLineNum = 240;BA.debugLine="Public Sub Updatedata(ItemSupplier As String,item_";
 //BA.debugLineNum = 242;BA.debugLine="Dim UpdateItem As HttpJob";
_updateitem = new b4a.example.httpjob();
 //BA.debugLineNum = 243;BA.debugLine="UpdateItem.Initialize(\"UpdateItem\", Me)";
_updateitem._initialize /*String*/ (ba,"UpdateItem",this);
 //BA.debugLineNum = 244;BA.debugLine="UpdateItem.download2(\"http://\" & ip & \"/inventory";
_updateitem._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","UpdateExistingItem","updateData",_sam,"supplier",_itemsupplier,"item_name",_item_name,"item_description",_item_description,"item_no",BA.NumberToString(_item_no),"item_unit",_item_unit,"item_quantity",BA.NumberToString(_item_quantity),"item_unitcost",BA.NumberToString(_item_unitcost),"item_totalcost",_item_totalcost});
 //BA.debugLineNum = 247;BA.debugLine="DisplayData";
_displaydata();
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _updatesupplier(String _supplier_name,String _supplier_address,int _supplier_tin,String _supplier_pno,String _supplier_date,String _supplier_mop,String _supplier_pod,String _supplier_dod,String _supplier_dt,String _supplier_pt) throws Exception{
b4a.example.httpjob _updatesupp = null;
 //BA.debugLineNum = 251;BA.debugLine="Public Sub UpdateSupplier(supplier_Name As String,";
 //BA.debugLineNum = 254;BA.debugLine="Dim UpdateSupp As HttpJob";
_updatesupp = new b4a.example.httpjob();
 //BA.debugLineNum = 255;BA.debugLine="UpdateSupp.Initialize(\"UpdateSupply\", Me)";
_updatesupp._initialize /*String*/ (ba,"UpdateSupply",this);
 //BA.debugLineNum = 256;BA.debugLine="UpdateSupp.download2(\"http://\" & ip & \"/inventory";
_updatesupp._download2 /*String*/ ("http://"+_ip+"/inventory/inventory_API.php",new String[]{"action","UpdateExistingSupp","updateSupplier",_sam,"supplier_name",_supplier_name,"supplier_address",_supplier_address,"supplier_tin",BA.NumberToString(_supplier_tin),"supplier_pno",_supplier_pno,"supplier_date",_supplier_date,"supplier_mop",_supplier_mop,"supplier_PoD",_supplier_pod,"supplier_DoD",_supplier_dod,"supplier_DT",_supplier_dt,"supplier_PT",_supplier_pt});
 //BA.debugLineNum = 260;BA.debugLine="DisplayData";
_displaydata();
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((b4a.example.httpjob) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
