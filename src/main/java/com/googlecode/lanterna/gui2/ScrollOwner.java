package com.googlecode.lanterna.gui2;

public interface ScrollOwner {
    void invalidateScrollInfo();
    Scrollable getScrollController();
    void setScrollController(Scrollable controller);
}
