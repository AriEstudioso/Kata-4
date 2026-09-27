package app;

import io.CSVSongParser;
import io.CSVSongReader;
import model.Song;
import tasks.HistogramBuilder;
import view.MainFrame;
import viewmodel.Histogram;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        MainFrame.create().display(histogramOf(songs())).setVisible(true);
    }

    private static Histogram<Object> histogramOf(Stream<Song> songs) {
        return HistogramBuilder
                .with(songs.filter(song -> song.year() > 2000 && song.year() < 2027))
                .title("Songs by year")
                .x("Year")
                .y("Count")
                .legend("Songs")
                .build(Song::year);
    }

    private static Stream<Song> songs() throws IOException {
        return new CSVSongReader(CSVSongParser::parse).songs();
    }
}
