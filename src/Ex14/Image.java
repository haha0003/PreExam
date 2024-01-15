package Ex14;

public class Image {
    private String fileName;
    private int width;
    private int height;

    Image(String fileName, int height, int width){
        this.fileName = fileName;
        this.height = height;
        this.width = width;
    }

    public boolean isKnownFileType(){
        String[] types = {".gif",  ".jpg", ".jpeg", ".png", ".webp", ".bmp"};
        for (String type : types){
            if (fileName.contains(type)){
                return true;
            }
        }
        return false;
    }

    public boolean isPortrait(){
        return height > width;
    }

    public boolean isLandscape(){
        return height < width;
    }

    @Override
    public String toString() {
        return "Image{" +
                "fileName='" + fileName + '\'' +
                ", width=" + width +
                ", height=" + height + "Landscape:" + isLandscape() +
                "Potrait: " + isPortrait() +
                '}';
    }
}
