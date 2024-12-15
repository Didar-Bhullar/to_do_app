package org.notes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class NoteTest {
  private final Note note = new Note("NoteName", "my note summary");

  @Test
  public void testNoteNameEdit() {
    note.editNoteName("NoteName2");
    assertEquals("NoteName2", note.getName());
  }

  @Test
  public void testNoteSummaryEdit() {
    note.editNoteSummary("edited summary");
    assertEquals("edited summary", note.getNoteSummary());
  }

  @Test
  public void testToString() {
    note.setId(1);
    LocalDate date = LocalDate.now();
    assertEquals(date.toString() + "\n1\nNoteName\nmy note summary", note.toString());
  }
}
