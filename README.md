# Groovy sandbox repo

My notes for the groovy scripting language.
I need to familiarize myself with the language because we are going to
use it to build Jenkins pipelines for Managed Platform

## Installation

For groovy to work, you're going to need to have a working [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
(java development kit) install.
Groovy is really just a modified version of Java,
with some changes to the syntax to make scripting easier.

Once you have a working version of the JDK, you'll need to install groovy.
http://groovy-lang.org/download.html#osinstall

On macOs, the most convenient way to install groovy is using homebrew.
If you don't know what homebrew is, google it.

```
$ brew install groovy
```

Once installed, you can run any of the files in this repo from the command line

```
$ groovy `path-to-file`
```

Currently, groovy