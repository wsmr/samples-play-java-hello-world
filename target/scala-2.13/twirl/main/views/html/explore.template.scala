
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object explore extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Hello World")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>
      <h2>Play application overview</h2>

      <p>This tutorial is implemented as a Play application that demonstrates Play's basics. We started with the Play
        Java seed template, which set up the application project structure and the configuration to build with sbt.
        We added stylesheets with Play's colors and a Table of Contents.</p>
      <p>Let's start by looking at what happens at runtime. When you entered the server name and port number, <a target="play-docs"
          href="http://localhost:9000/">http://localhost:9000/</a>, in your browser:</p>
      <ul>
        <li>The browser requested the root <code>/</code> URI from the HTTP server using the <code>GET</code> method.</li>
        <li>The Play internal HTTP Server received the request.</li>
        <li>Play resolved the request using the <code>routes</code> file, which maps URIs to controller action methods.</li>
        <li>The action method used Twirl templates to render the <code>index</code> page.</li>
        <li>The HTTP server returned the response as an HTML page.</li>
      </ul>
      <p> At a high level, the flow looks something like this:</p>
      <p><img src="assets/images/play-request-response.png" alt="Request and response" class="small-5 medium-4 large-3" /></p>
      <h3>Explore the project</h3>
      <p>Next, let's look at the tutorial project to locate the implementation for the following:</p>
      <ul>
        <li>The controller action method that defines how to handle a request to the root URI.</li>
        <li>The <code>conf/routes</code> file that maps the request to the controller method.</li>
        <li>The Twirl template that the action method calls to render the HTML markup.</li>
      </ul>
      <p>Using a command window or a GUI, start with the top-level project directory. The following directories contain
        application components:</p>

      <blockquote>Note: When changing directories in Windows shells, substitute <code>/</code> for <code>\</code> in
        path names.</blockquote>
      <p>
        <ol>
          <li>The <code>app</code> subdirectory is where you put your Java code and packages. It contains directories
            for <code>controllers</code> and <code>views</code>, which will be familiar to those experienced with the
            Model View Controller (MVC) architecture. Since this simple project does not need an external data
            repository, it does not contain a <code>models</code> directory, but this is where you would add it. You
            could also add a <code>service</code> package and <code>utils</code> here. </li>
          <li>The <code>public</code> subdirectory contains directories for <code>images</code>, <code>javascripts</code>,
            and <code>stylesheets</code>.</li>
          <li>The <code>conf</code> directory contains application configuration. For a more detailed explanation of
            the project's structure, see <a href="https://www.playframework.com/documentation/"""),_display_(/*47.96*/version),format.raw/*47.103*/("""/Anatomy#The-Play-application-layout"
              target="blank" />Play Application Layout</a>.</li>

          <li>
            <p>To locate the controller action method, open <code>app/controllers/HomeController.java</code> file with
            your favorite text editor.</p>

            <p>The <code>Homecontroller</code> class includes the <code>index</code> action method, as shown below.
              This is a very simple action method that generate an HTML page from the <code>index.scala.html</code>
              Twirl template file.</p>
              <pre><code class="language-java">public Result index() """),format.raw/*57.70*/("""{"""),format.raw/*57.71*/("""
  """),format.raw/*58.3*/("""return ok(views.html.index.render());
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""</code></pre>
          </li>
          <li>To view the route that maps the browser request to the controller method, open the <code>conf/routes</code>
            file.
            <p>A route consists of an HTTP method, a path, and an action. This control over the URL schema makes it
              easy to
              design clean, human-readable, bookmarkable URLs. The following line maps a GET request for the root URL
              <code>/</code>
              to the <code>index</code> action in <code>HomeController</code>:</p>
            <code>GET     /                           controllers.HomeController.index</code></li>
          <li>Open <code>app/views/index.scala.html</code> with your text editor.
            <p>The main directive in this file calls the main template <code>main.scala.html</code> with the string
              <code>"Welcome"</code>
              to generate the page.
              You can open <code>app/views/main.scala.html</code> to see how a <code>String</code> parameter sets the
              page
              title.</p>
          </li>
        </ol>
      </p>
      <h3 id="next-steps">Next steps</h3>
      <p>With this overview of the tutorial application, you are ready to <a href=""""),_display_(/*80.85*/routes/*80.91*/.HomeController.tutorial),format.raw/*80.115*/("""">add
          your own "Hello World" greeting</a>.</p>
    </article>
    <aside>
      """),_display_(/*84.8*/commonSidebar()),format.raw/*84.23*/("""
    """),format.raw/*85.5*/("""</aside>
  </div>
</section>

""")))}),format.raw/*89.2*/("""
""")))}),format.raw/*90.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-02T14:06:39.211
                  SOURCE: /home/sahan/Play/Resources/play-samples-play-java-hello-world-tutorial/app/views/explore.scala.html
                  HASH: a4a484a30af1a9ece6738b448f144651a4428257
                  MATRIX: 943->1|1039->4|1066->6|1093->25|1132->27|1159->29|1206->68|1256->81|1284->83|4371->3143|4400->3150|5050->3772|5079->3773|5109->3776|5174->3814|5202->3815|6466->5052|6481->5058|6527->5082|6644->5173|6680->5188|6712->5193|6773->5224|6805->5226
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|37->6|78->47|78->47|88->57|88->57|89->58|90->59|90->59|111->80|111->80|111->80|115->84|115->84|116->85|120->89|121->90
                  -- GENERATED --
              */
          