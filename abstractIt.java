package pt.upa.transporter.ws.it;

import org.junit.*;
import static org.junit.Assert.*;

public abstract class AbstractIt {
	private static TranporterPortType _transporter;
	
 @BeforeClass
  public static void oneTimeSetUp() {
      _transporter = new TransporterClient(uddiURL, wsName);
  }


@AfterClass
  public static void oneTimeTearDown() {
      _transporter = null;
  }

@Before
  public void setUp() {
  }

@After
  public void tearDown() {
  }

  @Test
  public void testPing() {
      final int result= client.sum(1, 2);
      assertEquals(3, result);
  }

}
