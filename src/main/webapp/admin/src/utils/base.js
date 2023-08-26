const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm6w3g2/",
            name: "ssm6w3g2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6w3g2/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "高校学生党建管理系统"
        } 
    }
}
export default base
