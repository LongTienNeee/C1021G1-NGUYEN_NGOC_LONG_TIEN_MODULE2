package ss18_string_and_regex.thuc_hanh.crawl_danh_sach_bai_hat;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static final String FILE_MUSIC = "https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html";

    public static void main(String[] args) {
        try {
            URL url = new URL(FILE_MUSIC);
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", "");

            String nameSong = "name_song\">(.*?)</a>";
            Pattern pattern = Pattern.compile(nameSong);
            Matcher matcher = pattern.matcher(content);
            while(matcher.find()){
                System.out.println(matcher.group(1));
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}