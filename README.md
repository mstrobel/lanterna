Lanterna
---

![Lanterna screenshot](http://wiki.lanterna.googlecode.com/git/images/screenshots/screenshot1.png)

Lanterna is a Java library allowing you to write easy semi-graphical user interfaces in a text-only environment,
very similar to the C library [curses](http://en.wikipedia.org/wiki/Curses_(programming_library)) but with more functionality.
Lanterna is supporting xterm compatible terminals and terminal emulators such as konsole, gnome-terminal, putty, xterm and many more.
One of the main benefits of lanterna is that it's not dependent on any native library but runs 100% in pure Java.

Also, when running Lanterna on computers with a graphical environment (such as Windows or Xorg), a bundled terminal emulator
written in Swing will be used rather than standard output. This way, you can develop as usual from your IDE
(most of them doesn't support ANSI control characters in their output window) and then deploy to your headless server without changing any code.

Lanterna is structured into three layers, each built on top of the other and you can easily choose which one fits your needs best.

1. The first is a low level terminal interface which gives you the most basic control of the terminal text area.
   You can move around the cursor and enable special modifiers for characters put to the screen. You will find these classes in package com.googlecode.lanterna.terminal.

2. The second level is a full screen buffer, the whole text screen in memory and allowing you to write to this before flushing the changes to the actual terminal.
   This makes writing to the terminal screen similar to modifying a bitmap. You will find these classes in package com.googlecode.lanterna.screen.

3. The third level is a full GUI toolkit with windows, buttons, labels and some other components.
   It's using a very simple window management system (basically all windows are modal) that is quick and easy to use.
   You will find these classes in package com.googlecode.lanterna.gui2.


Maven
---

Lanterna is available on [Maven Central](http://search.maven.org/), through [Sonatype OSS hosting](http://oss.sonatype.org/). Here's what you want to use:

```xml
    <dependency>
        <groupId>com.googlecode.lanterna</groupId>
        <artifactId>lanterna</artifactId>
        <version>2.1.9</version>
    </dependency>
```

There's also a preview release available of the upcoming 3.0 release:

```xml
    <dependency>
        <groupId>com.googlecode.lanterna</groupId>
        <artifactId>lanterna</artifactId>
        <version>3.0.0-beta1</version>
    </dependency>
```


Development Guide
---
See [docs](docs/contents.md) for examples and guides.

JavaDoc is available here:
 * 2.1: http://mabe02.github.io/lanterna/apidocs/2.1/
 * 3.0: http://mabe02.github.io/lanterna/apidocs/3.0/

See wiki for examples and Development Guide: https://code.google.com/p/lanterna/wiki/DevelopmentGuide