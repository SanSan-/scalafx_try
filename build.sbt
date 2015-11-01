name := "ScalaFX Application"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.60-R9"

// some hardcode to avoid "modena.css not found" error. later when i will know how to find java_home i will use follow command:
// unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))
unmanagedJars in Compile += Attributed.blank(file("/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/jfxrt.jar"))