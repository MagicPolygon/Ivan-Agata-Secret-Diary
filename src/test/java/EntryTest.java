import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// @Nested
@DisplayName("Constructor tests")
public class EntryTest {
    @Test
    @DisplayName("Constructor sets expected values when valid")
    public void testConstructorSetsValuesWhenValid() {
        // Arrange
        String testTitle = "My Secret Crush";
        String testContent = "I saw my dream today. We brush fingertips.";
        String testDate = "31/01/2024";

        // Act
        Entry testEntry = new Entry(testTitle, testContent, testDate);

        // Assert
        assertAll("Constructor sets values when valid",
                () -> assertEquals(testTitle, testEntry.getTitle()),
                () -> assertEquals(testContent, testEntry.getContent()),
                () -> assertEquals(testDate, testEntry.getDate()));
    }

}
