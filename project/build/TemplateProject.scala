/*
 * Copyright (c) ProInnovate Limited, 2010
 */

import sbt._

class TemplateProject(info: ProjectInfo) extends DefaultProject(info) with posterous.Publish {
  // Note that in all the dependencies below the source and javadoc links are there in order to download the source
  // and javadoc during development to enhance the IDE development environment.

  // Logging...
  val slf4s = "com.weiglewilczek.slf4s" %% "slf4s" % "1.0.2" % "compile;provided->sources,javadoc"
  val logback = "ch.qos.logback" % "logback-classic" % "0.9.27" % "compile;provided->sources,javadoc"

  // Testing...
  val scalatest = "org.scalatest" % "scalatest" % "1.2" % "test;provided->sources,javadoc"
  val scalacheck = "org.scala-tools.testing" %% "scalacheck" % "1.8" % "test;provided->sources,javadoc"

  // postereous.Publish configuration...
  override def extension = ".md"
  // override def extraTags = "template" :: super.extraTags

  // Maven publishing configuration...
  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)

}
