# Mastering the Jenkins Script Console

This repository contains demo files of my presentation at Jenkins World 2017:
[Mastering the Jenkins Script Console][sched].

# Watch the video

This presentation was recorded and is [available on YouTube][yt].

# Presentation Abstract

This interactive talk allows new users and seasoned experts alike to hone their
skills in mastering the Jenkins Script Console. It is the most powerful
interface Jenkins offers.

I will discuss steps users and admins can take in order to go about
understanding how to interact with the Jenkins Script Console. The talk will
involve:

- The role the Script Console plays with the Jenkins configuration.
- Recommendations on operationalizing a Jenkins installation for production use.
- How the Script Console can be used to configure Jenkins settings live, on an
  instance.
- Solid steps to take in order to get better at using the Script Console.
- Share additional resources which allow one to grow at using the Script Console
  further.


# Requirements

- Mac OS X or Linux.
- More than two CPU cores recommended.
- More than 6GB of RAM recommended if running Jenkins.

Optional requirements:

- [VirtualBox][vbox]
- [Vagrant][vagrant]

# Getting Started

1. Bootstrap the demo.

   ```
   git clone --recursive https://github.com/samrocketman/demo-jenkins-world-2017
   cd demo-jenkins-world-2017/
   ./jenkins_bootstrap.sh
   ```

2. Visit `http://localhost:8080/` and follow along.

# Common gradle tasks

The following tasks would be executed with `./gradlew TASK`.  List of common
TASKs include:

- `clean` - cleans the build directory and all bootstrap related files.
- `buildRpm` - builds an RPM package for RHEL based Linux distros.
- `buildDeb` - builds a DEB package for Debian based Linux distros.
- `packages` - executes both `buildRpm` and `buildDeb` tasks.
- `getjenkins` - Downloads `jenkins.war` to the current directory.
- `getplugins` - Downloads Jenkins plugin HPI files to `./plugins`.

# Additional Instructions

### Provision Jenkins via Vagrant

This repository optionally uses [Vagrant][vagrant].  To bootstrap Jenkins simply
run the following to start Jenkins.

    vagrant up
    export VAGRANT_JENKINS=1
    ./jenkins_bootstrap.sh

Visit `http://localhost:8080/` to see Jenkins running.  Clean up when you're
finished with the following command.

    vagrant destroy

### Upgrade Jenkins and plugins

To upgrade Jenkins master and plugin versions do the following:

    ./jenkins_bootstrap.sh
    ./jenkins-bootstrap-shared/scripts/upgrade/upgrade_build_gradle.sh
    git add -A && git commit -m 'jenkins upgraded'

### Build an RPM package

    ./gradlew clean buildRpm

# License

* [ASL 2](LICENSE)

[sched]: http://sched.co/ALN9
[vagrant]: https://www.vagrantup.com/
[vbox]: https://www.virtualbox.org/
[yt]: https://www.youtube.com/watch?v=qaUPESDcsGg
