
var projectName = '线上学习网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '考试记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '课程',
	url: './pages/kecheng/list.html'
}, 
{
	name: '课程视频',
	url: './pages/kechengshipin/list.html'
}, 
{
	name: '课程资料',
	url: './pages/kechengziliao/list.html'
}, 

{
	name: '试卷列表',
	url: './pages/exampaper/list.html'
}, 
]

var adminurl =  "http://localhost:8080/ssm3n87r/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学科信息","menuJump":"列表","tableName":"xuekexinxi"}],"menu":"学科信息管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"课程","menuJump":"列表","tableName":"kecheng"}],"menu":"课程管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"课程视频","menuJump":"列表","tableName":"kechengshipin"}],"menu":"课程视频管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"课程资料","menuJump":"列表","tableName":"kechengziliao"}],"menu":"课程资料管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷管理","tableName":"exampaper"}],"menu":"试卷管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["新增","查看","修改","删除"],"menu":"试卷列表","tableName":"exampaperlist"},{"buttons":["新增","查看","修改","删除"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程列表","menuJump":"列表","tableName":"kecheng"}],"menu":"课程模块"},{"child":[{"buttons":["查看"],"menu":"课程视频列表","menuJump":"列表","tableName":"kechengshipin"}],"menu":"课程视频模块"},{"child":[{"buttons":["查看"],"menu":"课程资料列表","menuJump":"列表","tableName":"kechengziliao"}],"menu":"课程资料模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程列表","menuJump":"列表","tableName":"kecheng"}],"menu":"课程模块"},{"child":[{"buttons":["查看"],"menu":"课程视频列表","menuJump":"列表","tableName":"kechengshipin"}],"menu":"课程视频模块"},{"child":[{"buttons":["查看"],"menu":"课程资料列表","menuJump":"列表","tableName":"kechengziliao"}],"menu":"课程资料模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"学科信息","menuJump":"列表","tableName":"xuekexinxi"}],"menu":"学科信息管理"},{"child":[{"buttons":["查看","新增","修改","删除","查看评论"],"menu":"课程","menuJump":"列表","tableName":"kecheng"}],"menu":"课程管理"},{"child":[{"buttons":["查看","新增","修改","删除","查看评论"],"menu":"课程视频","menuJump":"列表","tableName":"kechengshipin"}],"menu":"课程视频管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"课程资料","menuJump":"列表","tableName":"kechengziliao"}],"menu":"课程资料管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷管理","tableName":"exampaper"}],"menu":"试卷管理"},{"child":[{"buttons":["查看"],"menu":"试卷列表","tableName":"exampaperlist"},{"buttons":["查看"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程列表","menuJump":"列表","tableName":"kecheng"}],"menu":"课程模块"},{"child":[{"buttons":["查看"],"menu":"课程视频列表","menuJump":"列表","tableName":"kechengshipin"}],"menu":"课程视频模块"},{"child":[{"buttons":["查看"],"menu":"课程资料列表","menuJump":"列表","tableName":"kechengziliao"}],"menu":"课程资料模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
