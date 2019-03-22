package com.g_three.myrichtext;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.g_three.myrichtext.utils.PopupWindowUtil;

import jp.wasabeef.richeditor.RichEditor;

/**
 * @Author: G_three
 * @Mood: Pumped Up
 * @Date: 2019/3/22 10:34
 **/
public class MainActivityTest extends Activity {



    private RichEditor mEditor;
    private TextView mPreview;
    private ImageView imageView;
    private LinearLayout mLyH;
    private TextView mTvH;
    private TextView mTvA;
    private TextView tv_title;
    private ImageView mImgPalette;

    private LinearLayout mLyMark;
    String[] mPermissionList = new String[]{
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE};
    public static final int REQUEST_PICK_IMAGE = 11101;

    private View.OnClickListener itemsOnClick = new View.OnClickListener() {

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_b:
                    mEditor.focusEditor();
                    mEditor.setBold();
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.img_t:
                    mEditor.focusEditor();
                    mEditor.setItalic();
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.img_u:
                    mEditor.focusEditor();
                    mEditor.setUnderline();
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_point:
                    mEditor.setBullets();
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.tv_l:
                    mEditor.focusEditor();
                    mEditor.setStrikeThrough();
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.img_h1:
                    mEditor.setHeading(1);
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.img_h2:
                    mEditor.setHeading(2);
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.img_h3:
                    mEditor.setHeading(3);
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.img_zw:
                    mEditor.setHeading(3);
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_red:
                    mEditor.setTextColor(Color.RED);
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_orange:
                    mEditor.setTextColor(getResources().getColor(R.color.orange));
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_yellow:
                    mEditor.setTextColor(Color.YELLOW);
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_violet:
                    mEditor.setTextColor(getResources().getColor(R.color.violet));
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_blue:
                    mEditor.setTextColor(getResources().getColor(R.color.blue));
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_black:
                    mEditor.setTextColor(getResources().getColor(R.color.black));
                    PopupWindowUtil.popupWindow.dismiss();
                    break;
                case R.id.ly_white:
                    mEditor.setTextColor(getResources().getColor(R.color.white));
                    PopupWindowUtil.popupWindow.dismiss();
                    break;

                default:
                    break;
            }


        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_test);
        mEditor = (RichEditor) findViewById(R.id.editor);



        mEditor.setHtml("<div id=\"content\">\n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\">今年清明节扫墓高峰期顺利度过。根据民政部门的统计，全市大约有346万市民到163处墓园祭扫亲人，祭扫人数创历史新高，本周末还将迎来最后一批扫墓市民。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\">与扫墓相伴的踏青人数小长假暴涨，北京晨报记者从北京市公园管理中心获悉：清明期间，颐和园、天坛、北海等市属11家公园共接待游客200万人，创历年清明小长假人数之最，比此前官方预估的游人量增加50万人。今年天公作美，玉渊潭、颐和园、北京植物园都是一片花的海洋，致各大公园游客接待量大幅增长，假日第二天更是达到了74万的峰值，三天累计接待游客接近204万人次，同比去年增长近三成。植物园和紫竹院的游客量几乎翻番增加。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\">小长假过后，玉渊潭公园的晚樱迎来最后的辉煌，中山公园的郁金香节拉开帷幕，陶然亭公园的风筝节正在举办、植物园各种春花集于一身，美不胜收，香山的山花节也在筹备中……没逛够的市民可以接茬儿逛。市公园管理中心提示游客：今年气温高于往年，多数春花比往年提前了一周进入盛花期。清明节后，海棠、郁金香、丁香等春花将集中进入最佳观赏期。市民可参照每周的“公园花信风向标”，选择非周末的时段错峰游园。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\"><strong>17.2万人畅游农业嘉年华</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\">在刚刚过去的3天清明假期里，17.2万人次游客涌入第二届北京农业嘉年华的场馆。蔚蓝的蓝天、风和日丽的好天气，更给人们带来了游园之旅的好心情。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\">半个手臂长短的杏鲍菇，一两米长的丝瓜，如繁星般密集的各种葫芦、小瓜……瓜果在这个清明假期里，达到了最佳的观赏期。许多游客一边参观一边发出惊呼。“这个假期里，馆内将温湿度都进行了调节。”现阶段，温度、湿度非常适宜游园。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\"><strong>■清明·新政</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\"><strong>八宝山老墓今年开展续租业务</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px;\">今年清明节，八宝山一些墓穴贴着“墓穴租期到期，家属请与葬后服务办公室联系”的字条。墓地到期续租成为市民热议的话题。来自民政部门的消息说，目前北京市多家陵园已经出现了墓地使用超20年期问题，部分老墓联系不上家属，民政部门正在对此问题进行研究。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">根据国家及北京市相关规定，墓穴和骨灰格位的一个使用周期最长为20年，期满后可以续租。八宝山也张贴出“关于办理老墓续租业务的通告”，指出要分批分区办理续租手续，至今年底，第一批五个区域将完成老墓续租的手续；第二批两个区域将分别于8月和11月开展续租业务。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">该通告明确提出，按期续租可享受相关优惠规定，对逾期办理的并没有处罚措施。目前，太子峪陵园、福田公墓、通惠陵园、八达岭人民公墓、万安公墓等都出现了墓地使用超出期限问题，由于电话号码和通信地址的变更，很多老墓家属联系不上；有些联系上的家属也耗着不来办手续。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>■清明·交通</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>小长假期 563万辆车上高速</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">为期三天的清明小长假结束，北京各大高速再次经历了一场难熬的考验。三天里，北京各大高速路交通量总计高达563万辆次，这个数字，意味着平均每辆京牌车都往高速上转悠超过一次。与之相伴的，则是连续三天高速实时路况出现的“红色”拥堵。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">除了京开，城北出行同样“痛苦”，京藏高速北安河至上清桥段、京承高速吉祥寺桥至来广营桥段也是每天“红色”拥堵。交通部门虽然此前给出了绕行路线，但由于部分市民不太熟悉路线，因此也只能堵在了老路上。据市交通委通报，4月5日至7日清明假期期间，高速路交通量总计563万辆次，日均187.6万辆次, 比去年同期增长了9.5%。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">这个假期，不仅是高速出行创了纪录，地铁同样没闲着。北京地铁方面，清明期间14条线路共运送乘客2196.6万人次，日均732.2万人次，同比增长了16%。最高峰是清明节当天，773.1万人次乘坐地铁。京港地铁所辖各线总客运量共计达527.39万人次，其中，4号线3天内运送了超过417万人。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">昨日24时，各高速免费通行结束，所有收费站口恢复正常收费状态。今天是清明小长假后的首个工作日早高峰，公交集团在京藏、京通、京港澳高速、阜石路等进出城联络线进城方向以及途经回龙观、天通苑、望京等大型居住社区周边公交线路，增加了200部机动车应对大客流。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>■现场</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>小长假最后一天比预想好走</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">昨天高速公路和城区环路均没有出现预想中的大面积暴堵。下午5点20分，全路网交通指数仅为2.9，属于基本畅通。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">市交通委的数据显示，昨天0时至9时，高速公路交通量约为33.44万，比前日同时段（32.91万）微增1.61%。其中，进京约17.47万，出京约15.97万。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">晚上7点，京通快速出京方向双桥以西路段主路中间车道有事故，导致后车行驶缓慢。环路上，除西三环、东三环和二环部分路段外，四环和五环路已行驶畅通。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>■清明·消费</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>40家商企三天销售近10亿元</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">北京市商务委员会昨日发布监测信息，清明节假期中，40家重点商业服务业企业累计实现零售额9.8亿元，同比增长5.6%。眼下春茶正是应季上市的时间，北京晨报记者从市场上了解到，今年的新茶以中低端价位为主，往年送礼的大单采购明显减少。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">清明前后是新茶开始大量上市的时间，头茬儿龙井、碧螺春陆续上市，引来不少爱茶的市民进行选购。吴裕泰开展了“明前茶预约有礼”活动，清明期间销售增长11%。今年的新茶价格与去年基本持平，吴裕泰销售负责人介绍说，许多老顾客在春节前就已经预定了头一批明前茶，因此首批上市后供不应求，5500元一斤的售价基本与去年相当。最低价位的碧螺春茶仅需260元一斤左右。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">北京晨报记者从鸿宾楼、同和居、曲园酒楼、烤肉宛、砂锅居、又一顺等老字号了解到，节日期间天气给力，出门踏青的人明显增加，春季时令菜肴受到了追捧。老西安饭庄的菌菇泡馍、羊肉串外卖销量比平日增长近一倍，烤肉季推出的“赏什刹海美景，品烤肉季船宴”体验活动，成为消费时尚选择。眉州东坡、便宜坊、金鼎轩节日期间销售增长超过17%。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>■清明·消防</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\"><strong>消防出警531次</strong></p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">昨天小长假结束，北京消防从3月29日开始的清明保卫也告一段落。十天里，119指挥中心共接全市报火警149起，抢险救援警情208起，社会救助警情174起，没有突出火情，火灾形势整体平稳。</p> \n" +
                " \n" +
                "<p style=\"text-indent: 2em; padding: 3px 0px; display: block;\">对于普通市民，清明假期是从4月5日开始的，而对于北京消防来说，保卫工作从3月29日首个祭扫高峰就已开始。此前，北京消防已在全市163个市、区级祭扫点加强消防监督检查力度，特别是八宝山革命公墓及周边地区，重点林区和墓地周边防火区。</p>\n" +
                "</div><div onclick=\"showHiddens();\" id=\"expanda\" style=\"text-align: center; margin: 30px 0px; padding: 6px 0px; display: none;\"><img style=\"vertical-align:middle\" src=\"./724D6A55496A11726628_files/expand.png\"><span style=\"vertical-align:middle\">&nbsp;点击展开全文</span></div>\n" +
                "</article>\n" +
                "<article style=\"display: block;\">\n" +
                "<div id=\"writer\">\n" +
                "<span>责任编辑：锁媛媛（QN074）</span>\n" +
                "\n" +
                "</div>");





        imageView = findViewById(R.id.img_inset);
        mTvH = (TextView)findViewById(R.id.tv_h);
        mLyH = findViewById(R.id.ly_h);
        mTvA = findViewById(R.id.tv_a);
        tv_title = findViewById(R.id.tv_title);



        tv_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"cnmccccccccccccccc",Toast.LENGTH_LONG).show();
            }
        });











        mLyMark = (LinearLayout)findViewById(R.id.ly_mark);
        mImgPalette = (ImageView)findViewById(R.id.img_palette);
        final  View mViewStyle = View.inflate(MainActivityTest.this, R.layout.item_popup_style, null);
        final View mViewTypeface = View.inflate(MainActivityTest.this, R.layout.item_popup_typeface, null);
        final View mViewColor= View.inflate(MainActivityTest.this, R.layout.item_popup_color, null);
        mTvA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupWindowUtil.showPopupWindow(MainActivityTest.this, mViewStyle, view, 1, itemsOnClick);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditor.focusEditor();
                ActivityCompat.requestPermissions(MainActivityTest.this, mPermissionList, 100);
            }
        });
        mTvH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupWindowUtil.showPopupWindow(MainActivityTest.this, mViewTypeface, view, 1, itemsOnClick);
            }
        });
        mImgPalette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupWindowUtil.showPopupWindow(MainActivityTest.this, mViewColor, view, 1, itemsOnClick);
            }
        });
        mLyMark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditor.setBlockquote();
            }
        });
        //初始化编辑高度
        // mEditor.setEditorHeight(200);
        //初始化字体大小
        mEditor.setEditorFontSize(22);
        //初始化字体颜色
        mEditor.setEditorFontColor(Color.BLACK);
        //mEditor.setEditorBackgroundColor(Color.BLUE);

        //初始化内边距
        mEditor.setPadding(10, 10, 10, 10);
        //设置编辑框背景，可以是网络图片
        // mEditor.setBackground("https://raw.githubusercontent.com/wasabeef/art/master/chip.jpg");
        // mEditor.setBackgroundColor(Color.BLUE);
        //mEditor.setBackgroundResource(R.drawable.bg);
        //设置默认显示语句
        mEditor.setPlaceholder("Insert text here...");
        //设置编辑器是否可用
        mEditor.setInputEnabled(true);

        mPreview = (TextView) findViewById(R.id.preview);
        mEditor.setOnTextChangeListener(new RichEditor.OnTextChangeListener() {
            @Override
            public void onTextChange(String text) {
                mPreview.setText(text);
            }
        });
        /**
         * 撤销当前标签状态下所有内容
         */
        findViewById(R.id.action_undo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.undo();
            }
        });
        /**
         * 恢复撤销的内容
         */
        findViewById(R.id.action_redo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.redo();
            }
        });
        /**
         * 加粗
         */
        findViewById(R.id.action_bold).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.setBold();
            }
        });
        /**
         * 斜体
         */
        findViewById(R.id.action_italic).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.setItalic();
            }
        });
        /**
         * 下角表
         */
        findViewById(R.id.action_subscript).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                if (mEditor.getHtml() == null) {
                    return;
                }
                mEditor.setSubscript();
            }
        });
        /**
         * 上角标
         */
        findViewById(R.id.action_superscript).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                if (mEditor.getHtml() == null) {
                    return;
                }
                mEditor.setSuperscript();
            }
        });

        /**
         * 删除线
         */
        findViewById(R.id.action_strikethrough).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.setStrikeThrough();
            }
        });
        /**
         *下划线
         */
        findViewById(R.id.action_underline).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.setUnderline();
            }
        });
        /**
         * 设置标题（1到6）
         */
        findViewById(R.id.action_heading1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(1);
            }
        });

        findViewById(R.id.action_heading2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(2);
            }
        });

        findViewById(R.id.action_heading3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(3);
            }
        });

        findViewById(R.id.action_heading4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(4);
            }
        });

        findViewById(R.id.action_heading5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(5);
            }
        });

        findViewById(R.id.action_heading6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(6);
            }
        });
        /**
         * 设置字体颜色
         */
        findViewById(R.id.action_txt_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                new MaterialDialog.Builder(MainActivityTest.this)
                        .title("选择字体颜色")
                        .items(R.array.color_items)
                        .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                            @Override
                            public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {

                                dialog.dismiss();
                                switch (which) {
                                    case 0://红
                                        mEditor.setTextColor(Color.RED);
                                        break;
                                    case 1://黄
                                        mEditor.setTextColor(Color.YELLOW);
                                        break;
                                    case 2://蓝
                                        mEditor.setTextColor(Color.GREEN);
                                        break;
                                    case 3://绿
                                        mEditor.setTextColor(Color.BLUE);
                                        break;
                                    case 4://黑
                                        mEditor.setTextColor(Color.BLACK);
                                        break;
                                }
                                return false;
                            }
                        }).show();
            }
        });

        findViewById(R.id.action_bg_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                new MaterialDialog.Builder(MainActivityTest.this)
                        .title("选择字体背景颜色")
                        .items(R.array.text_back_color_items)
                        .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                            @Override
                            public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {

                                dialog.dismiss();
                                switch (which) {
                                    case 0://红
                                        mEditor.setTextBackgroundColor(Color.RED);
                                        break;
                                    case 1://黄
                                        mEditor.setTextBackgroundColor(Color.YELLOW);
                                        break;
                                    case 2://蓝
                                        mEditor.setTextBackgroundColor(Color.GREEN);
                                        break;
                                    case 3://绿
                                        mEditor.setTextBackgroundColor(Color.BLUE);
                                        break;
                                    case 4://黑
                                        mEditor.setTextBackgroundColor(Color.BLACK);
                                        break;
                                    case 5://透明
                                        mEditor.setTextBackgroundColor(R.color.transparent);
                                        break;
                                }
                                return false;
                            }
                        }).show();

            }
        });
        /**
         * 向右缩进
         */
        findViewById(R.id.action_indent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.setIndent();
            }
        });
        /**
         * 向左缩进
         */
        findViewById(R.id.action_outdent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.setOutdent();
            }
        });
        /**
         *文章左对齐
         */
        findViewById(R.id.action_align_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.setAlignLeft();
            }
        });
        /**
         * 文章居中对齐
         */
        findViewById(R.id.action_align_center).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setAlignCenter();
            }
        });
        /**
         * 文章右对齐
         */
        findViewById(R.id.action_align_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setAlignRight();
            }
        });
        /**
         * 无序排列
         */
        findViewById(R.id.action_insert_bullets).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setBullets();
            }
        });
        /**
         * 有序排列
         */
        findViewById(R.id.action_insert_numbers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setNumbers();
            }
        });
        /**
         * 引用
         */
        findViewById(R.id.action_blockquote).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setBlockquote();
            }
        });

        /**
         * 插入图片
         */
        findViewById(R.id.action_insert_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                ActivityCompat.requestPermissions(MainActivityTest.this, mPermissionList, 100);
            }
        });
        /**
         * 插入连接
         */
        findViewById(R.id.action_insert_link).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(MainActivityTest.this)
                        .title("将输入连接地址")
                        .items("http://blog.csdn.net/huangxiaoguo1")
                        .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                            @Override
                            public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                                dialog.dismiss();
                                mEditor.focusEditor();
                                mEditor.insertLink("http://blog.csdn.net/huangxiaoguo1",
                                        "http://blog.csdn.net/huangxiaoguo1");
                                return false;
                            }
                        }).show();
            }
        });
        /**
         * 选择框
         */
        findViewById(R.id.action_insert_checkbox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.focusEditor();
                mEditor.insertTodo();
            }
        });

        /**
         * 显示Html
         */
        findViewById(R.id.tv_showhtml).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), WebViewActivity.class);
                intent.putExtra("contextURL", mEditor.getHtml());
                Toast.makeText(getApplicationContext(),mEditor.getHtml(),Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 100:
                boolean writeExternalStorage = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                boolean readExternalStorage = grantResults[1] == PackageManager.PERMISSION_GRANTED;
                if (grantResults.length > 0 && writeExternalStorage && readExternalStorage) {
                    getImage();
                } else {
                    Toast.makeText(this, "请设置必要权限", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }

    private void getImage() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            startActivityForResult(new Intent(Intent.ACTION_GET_CONTENT).setType("image/*"),
                    REQUEST_PICK_IMAGE);
        } else {
//            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
//            intent.addCategory(Intent.CATEGORY_OPENABLE);
//            intent.setType("image/*");
//            startActivityForResult(intent, REQUEST_PICK_IMAGE);
            /*打开相册*/
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_PICK);
            intent.setType("image/*");
            startActivityForResult(intent, 10);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == RESULT_OK) {
            if (data != null) {
                String realPathFromUri = RealPathFromUriUtils.getRealPathFromUri(this, data.getData());
//                mEditor.insertImage("https://unsplash.it/2000/2000?random&58",
//                        "huangxiaoguo\" style=\"max-width:100%");
                mEditor.insertImage(realPathFromUri, realPathFromUri + "\" style=\"max-width:100%");
//                        mEditor.insertImage(realPathFromUri, realPathFromUri + "\" style=\"max-width:100%;max-height:100%");

            } else {
                Toast.makeText(this, "图片损坏，请重新选择", Toast.LENGTH_SHORT).show();
            }

        }
    }


}
