// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sahan/Play/Resources/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Mon Dec 02 14:06:38 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
