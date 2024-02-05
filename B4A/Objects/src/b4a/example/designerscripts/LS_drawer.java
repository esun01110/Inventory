package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_drawer{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="MenuPanel2.Top = MenuPanel1.Bottom + 5dip"[drawer/General script]
views.get("menupanel2").vw.setTop((int)((views.get("menupanel1").vw.getTop() + views.get("menupanel1").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 5;BA.debugLine="MenuPanel3.Top = MenuPanel1.Bottom + 5dip"[drawer/General script]
views.get("menupanel3").vw.setTop((int)((views.get("menupanel1").vw.getTop() + views.get("menupanel1").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 7;BA.debugLine="SupplierPanel.Top = ItemPanel.Bottom + 5dip"[drawer/General script]
views.get("supplierpanel").vw.setTop((int)((views.get("itempanel").vw.getTop() + views.get("itempanel").vw.getHeight())+(5d * scale)));

}
}