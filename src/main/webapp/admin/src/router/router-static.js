import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import dangyuanxinxi from '@/views/modules/dangyuanxinxi/list'
    import dangkepeixunjieguo from '@/views/modules/dangkepeixunjieguo/list'
    import zhuanzhengguanli from '@/views/modules/zhuanzhengguanli/list'
    import pingyoushenqing from '@/views/modules/pingyoushenqing/list'
    import toupiao from '@/views/modules/toupiao/list'
    import users from '@/views/modules/users/list'
    import minzhutoupiao from '@/views/modules/minzhutoupiao/list'
    import zhengshenjieguo from '@/views/modules/zhengshenjieguo/list'
    import yonghu from '@/views/modules/yonghu/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import dangyuantanhuajilu from '@/views/modules/dangyuantanhuajilu/list'
    import config from '@/views/modules/config/list'
    import huodongzhanshi from '@/views/modules/huodongzhanshi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/dangyuanxinxi',
        name: '党员信息',
        component: dangyuanxinxi
      }
          ,{
	path: '/dangkepeixunjieguo',
        name: '党课培训结果',
        component: dangkepeixunjieguo
      }
          ,{
	path: '/zhuanzhengguanli',
        name: '转正管理',
        component: zhuanzhengguanli
      }
          ,{
	path: '/pingyoushenqing',
        name: '评优申请',
        component: pingyoushenqing
      }
          ,{
	path: '/toupiao',
        name: '投票',
        component: toupiao
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/minzhutoupiao',
        name: '民主投票',
        component: minzhutoupiao
      }
          ,{
	path: '/zhengshenjieguo',
        name: '政审结果',
        component: zhengshenjieguo
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
          ,{
	path: '/dangyuantanhuajilu',
        name: '党员谈话记录',
        component: dangyuantanhuajilu
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/huodongzhanshi',
        name: '活动展示',
        component: huodongzhanshi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
