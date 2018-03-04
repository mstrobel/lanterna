package com.googlecode.lanterna.gui2;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;

public final class Rectangle {
    public static final Rectangle EMPTY = new Rectangle(TerminalPosition.TOP_LEFT_CORNER, TerminalSize.ZERO);

    private final TerminalSize size;
    private final TerminalPosition position;

    private Rectangle(final TerminalPosition position, final TerminalSize size) {
        if (size == null) throw new NullPointerException("Size cannot be null.");
        if (position == null) throw new NullPointerException("Position cannot be null.");

        this.size = size;
        this.position = position;
    }

    public static Rectangle of(final TerminalPosition position, final TerminalSize size) {
        return new Rectangle(position, size);
    }

    public static Rectangle of(final TerminalSize size) {
        return new Rectangle(TerminalPosition.OFFSET_1x1, size);
    }

    public static Rectangle of(final int x, final int y, final int width, final int height) {
        return new Rectangle(new TerminalPosition(x, y), new TerminalSize(width, height));
    }

    public TerminalSize getSize() {
        return size;
    }

    public TerminalPosition getPosition() {
        return position;
    }

    public int getWidth() {
        return size.getColumns();
    }

    public int getHeight() {
        return size.getRows();
    }

    public int getLeft() {
        return position.getColumn();
    }

    public int getTop() {
        return position.getRow();
    }

    public int getRight() {
        return getLeft() + getWidth() - 1;
    }

    public int getBottom() {
        return getTop() + getHeight() - 1;
    }

    public boolean isEmpty() {
        return size.getColumns() == 0 && size.getRows() == 0;
    }
}
