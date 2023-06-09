public enum Size {
    SMALL("S", 11, 40),
    MEDIUM("M", 13, 45),
    LARGE("L", 15, 50),
    EXTRA_LARGE("XL", 17, 55);

    private String abbrName;
    public String getAbbrName() {
        return this.abbrName;
    }

    private int width;
    public int getWidth() {
        return this.width;
    }

    private int length;
    public int getLength() {
        return this.length;
    }

    Size(String abbrName, int width, int length) {
        this.abbrName = abbrName;
        this.width = width;
        this.length = length;
    }

    public String toString() {
        String fullName = super.toString();
        return this.abbrName + " or \"" + fullName + "\" size: width=" + this.width + ", length=" + this.length + "";
    }

}
