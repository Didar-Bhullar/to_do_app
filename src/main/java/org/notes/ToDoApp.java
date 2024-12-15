package org.notes;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

final public class ToDoApp {
  private final Map<Integer, Note> notesList;
  private int id;

  public ToDoApp() {
    this.notesList = new HashMap<>();
    this.id = 0;
  }

  public Note getNote(int id) {
    return notesList.get(id);
  }

  public int addNote(String name, String notes) {
    this.id += 1;
    Note note = new Note(name, notes);
    note.setId(this.id);
    this.notesList.put(id, note);
    return this.id;
  }

  public boolean deleteNote(int id) {
    if (!notesList.containsKey(id)) {
      return false;
    }
    notesList.remove(id);
    return true;
  }

  public void deleteAllNotes() {
    this.notesList.clear();
    this.id = 0;
  }

  public boolean editNoteName(int id, String noteName) {
    if (notesList.containsKey(id)) {
      Note note = this.notesList.get(id);
      note.editNoteName(noteName);
      return true;
    }
    return false;
  }

  public boolean editNoteSummary(int id, String noteSummary) {
    if (notesList.containsKey(id)) {
      Note note = this.notesList.get(id);
      note.editNoteSummary(noteSummary);
      return true;
    }
    return false;
  }

  public List<Note> getAllNotes() {
    return new ArrayList<Note>(notesList.values());
  }

  public List<Note> getAllNotesByDate(LocalDate date) {
    List<Note> notesFoundList = new ArrayList<Note>();

    for (Note note : notesList.values()) {
      if (note.getDate().equals(date)) {
        notesFoundList.add(note);
      }
    }
    return notesFoundList;
  }
}
