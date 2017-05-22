# wasp-piglatin

![pig](http://globe-views.com/dcim/dreams/pig/pig-04.jpg)

This repository contains code for a minimal Java tool chain with

* Some Java source code, see `src/main/java`
* Some JUnit tests, see `src/test/java`
* An Ant build file with targets for `build`, `test`, `jar`, and `clean`. See `build.xml`.
* The source files are organized according to the Maven standard directory layout. See https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html .This facilitates integration with other tools, like the Continuous Integration tool Travis.
* We don't use any dependencies to download libraries. Instead, all dependent libraries are in included in the project in the `lib` folder.
* There is a fork of this project that uses Gradle instead of Ant, and that has a `.travis.yml` file for integration with Travis. See https://github.com/llbit/minimal-tool-chain

# Installation

To run this project, you need to have Java and Ant installed.

# Build

Do
* `ant` to compile
* `ant test` to additionally run all tests
* `ant jar` to generate a `Product.jar` file
* `ant clean` to clean away generated files.

# Run

Run the generated jar file by:
* `java -jar Product.jar`

Additional functionality can be used through flags:

usage: `java -jar Product.jar [options]`

--authors (-a)     Shows the authors of the Product

--verbose (-v)     Presents the translation steps in detail

--help    (-h)     Explains the correct usage of the program


Some cool features:
1. Any positive integers in the sentence will be translated into Piglatin words.

# How it looks like

![usage_pic](https://cloud.githubusercontent.com/assets/5601815/23937053/bee88518-0955-11e7-8fab-b89e0c050f81.png)

# Notes

This repository in a fork of minimal-tool-chain which can be found in https://github.com/gorelhedin/minimal-tool-chain

# Authors

Amir Roozbeh

Shahbaz Khader

Rui Oliveira
