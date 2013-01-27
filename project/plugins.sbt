
resolvers ++= Seq(
  "coda" at "http://repo.codahale.com",
  "gseitz@github" at "http://gseitz.github.com/maven/",
  "lessis" at "http://repo.lessis.me"
)

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.6")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

// Plugin for generating projects dependency details for Intellij IDEA...
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0")

// Add this to your global ~/.sbt/plugins/build.sbt file and create user logon details etc. in a file such as
// ~/.sbt/posterous-sbt.sbt as described here: https://github.com/n8han/posterous-sbt
// addSbtPlugin("net.databinder" % "posterous-sbt" % "0.3.2")

// scct - Code coverage tool
resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

addSbtPlugin("reaktor" % "sbt-scct" % "0.2-SNAPSHOT")

// jacoco4sbt - Code coverage tool
libraryDependencies ++= Seq(
  "org.jacoco" % "org.jacoco.core" % "0.6.1.201212231917" artifacts(Artifact("org.jacoco.core", "jar", "jar")),
  "org.jacoco" % "org.jacoco.report" % "0.6.1.201212231917" artifacts(Artifact("org.jacoco.report", "jar", "jar")))

addSbtPlugin("de.johoop" % "jacoco4sbt" % "1.2.4")
