fun main() {
//    print("Test")

    val ysuNetLogin = YsuNetLogin()
    println(ysuNetLogin.getAuthStatus())
    println(ysuNetLogin.logout())
    println(ysuNetLogin.getAuthStatus())

//    val userInfo = ysuNetLogin.getUserData()
//    println(userInfo.getUserName())

}
