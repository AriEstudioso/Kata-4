package io;

import model.Song;

import java.util.List;
import java.util.stream.Stream;

public interface SongReader {
    Stream<Song> songs();
}
