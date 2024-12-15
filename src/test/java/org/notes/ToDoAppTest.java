package org.notes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ToDoAppTest {
  final private ToDoApp app = new ToDoApp();

  @Test
  public void testAddNote() {
    int id = app.addNote("Name", "Note");
    assertEquals(1, id);
  }

  @Test
  public void testGoodDeleteNote() {
    int id = app.addNote("Name", "Note");
    boolean result = app.deleteNote(id);
    assertEquals(true, result);
  }

  @Test
  public void testBadDeleteNote() {
    boolean result = app.deleteNote(100);
    assertEquals(false, result);
  }

  @Test
  public void testGoodEditNoteName() {
    int id = app.addNote("Name", "Note");
    boolean result = app.editNoteName(id, "EditedName");
    assertEquals(true, result);
    assertEquals("EditedName", app.getNote(id).getName());
  }

  @Test
  public void testBadEditNoteName() {
    boolean result = app.editNoteName(100, "EditedName");
    assertEquals(false, result);
  }

  @Test
  public void testGetAllNotesByDate() {
    LocalDate today = LocalDate.now();
    List<Note> notesFoundList = new ArrayList<Note>();
    int note_id = app.addNote("Name", "Note");

    Note note = app.getNote(note_id);
    notesFoundList = app.getAllNotesByDate(today);
    List<Note> expected = new ArrayList<Note>();
    expected.add(note);

    assertEquals(expected, notesFoundList);
  }
}
