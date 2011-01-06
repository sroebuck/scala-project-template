/*
 * Copyright (c) ProInnovate Limited, 2010
 */

import sbt._

class TemplateProject(info: ProjectInfo) extends DefaultProject(info) with posterous.Publish {

  // Testing...
  val scalatest = "org.scalatest" % "scalatest" % "1.1" % "test"

  // postereous.Publish configuration...
  override def extension = ".md"
  // override def extraTags = "template" :: super.extraTags

  // Maven publishing configuration...
  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)

}
