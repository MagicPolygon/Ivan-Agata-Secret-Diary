import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("Diary methods tests")
public class DiaryTest {
    @Test
    @DisplayName("Unlock method tests")
    public void testUnlockMethodUnlocksDiaryReturnsTrue() {
        // Arrange
        int testEnteredPin = 1234;
        int testCorrectPin = 1234;
        boolean isLocked = true;
        Diary diary = new Diary (testCorrectPin, isLocked);
        boolean expectedOutcome = true;

        // Act
        boolean actualOutcome = diary.unlock(testEnteredPin, testCorrectPin);

        // Assert
        Assert.assertEquals(expectedOutcome, actualOutcome);
    }
}
