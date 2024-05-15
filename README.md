![Build Status](https://github.com/opwvhk/plugin-loader-example/workflows/Maven%20Build/badge.svg)
[![license](doc/license-APACHE-2.0-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

Plugin Loader Example Project
=============================

A simple example demonstrating the use of the [plugin-loader](https://github.com/opwvhk/plugin-loader) project.

This example consists of 4 parts, which depend on each-other like this:

* API: has **no dependencies** (not strictly needed, but much easier)
* Core: depends on and packages the API module, and anything else it needs
* User 1 & 2: depend on the API (compile-time only) and anything else it needs (packages everything but the API)

To test:

	mvn && java -jar example/*.jar example/plugins/
