Scala Project Template
======================

This is a template project for open-source Scala projects.  It's intended to reduce the overheads of publishing some useful code to the community as a library.  The idea is that you just copy this project and then make it your own.

It provides (or goes some way to providing, or will provide!):

* publishing process control using [sbt-release](https://github.com/gseitz/sbt-release) which simplifies updating release versions but also provides some checks to make sure your release is suitable for publishing.
* publishing to [ls.implicit.ly](http://ls.implicit.ly/) using [ls-sbt](https://github.com/softprops/ls) to make it easier for others to find your library.
* publishing to [implicit.ly](http://implicit.ly/) using [posterous-sbt](https://github.com/n8han/posterous-sbt) for those who like to following the latest Scala library releases.
* deployment to the Sonatype Maven repository.

Version: 0.2-SNAPSHOT

This code is currently under development.

This template is not complete and I have yet to document what you need to change to make this work for you!

Prerequisites
-------------

To deploy a project to the Sonatype Maven repository you are best reading [this explanation](http://www.cakesolutions.net/teamblogs/2012/01/28/publishing-sbt-projects-to-nexus/) which explains that you need to set up your credentials in a file such as `~/.sbt/sonatype.sbt`, looking like:

    credentials += Credentials("Sonatype Nexus Repository Manager",
                               "oss.sonatype.org",
                               "username",
                               "password")

Building and installing
-----------------------


Using
-----


License
-------

This software is Copyright (c) 2011, Stuart Roebuck and licensed under a
standard MIT license (more specifically referred to as the Expat license). See
the `LICENSE.md` file for details.

