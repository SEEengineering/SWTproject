package ie.calc.v1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcFunctionTest {

    private CalcFunctions cf;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
        cf = new CalcFunctions();
        cf.setVal(100);
    }

    @DisplayName("Checking EuroToPound Method")
    @Test
    void testEuroTopound(){
        assertEquals(88.0,cf.EuroTopound(cf.getVal()));
    }

    @DisplayName("Checking EuroToJPY Method")
    @Test
    void testEuroToJPY(){
        assertEquals("11703",cf.EuroToJPY(cf.getVal()));
    }

    @DisplayName("Checking EuroToUS Method")
    @Test
    void testEuroToUS(){
        assertEquals("110.01",cf.EuroToUS(cf.getVal()));
    }

    @DisplayName("Checking EuroToBitcoin Method")
    @Test
    void testEuroToBitcoin(){
        assertEquals("0.02",cf.EuroToBitcoin(cf.getVal()));
    }

    @DisplayName("Checking EuroToAustraliandollar Method")
    @Test
    void testEuroToAustraliandollar(){
        assertEquals(168.0,cf.EuroToAustraliandollar(cf.getVal()));
    }

    @DisplayName("Checking GramsToPounds Method")
    @Test
    void testGramsToPounds() {
        assertEquals("0.220264",cf.GramsToPounds(cf.getVal()));
    }

    @DisplayName("Checking GramsToStone Method")
    @Test
    void testGramsToStone() {
        assertEquals("0.0157",cf.GramsToStone(cf.getVal()));
    }

    @DisplayName("Checking GramsToOunce Method")
    @Test
    void testGramsToOunce() {
        assertEquals("3.5273",cf.GramsToOunce(cf.getVal()));
    }

    @DisplayName("Checking GramsToEngFormat Method")
    @Test
    void testGramsToEngFormat() {
        assertEquals("100.0g",cf.GramsToEngFormat(cf.getVal()));
    }

    @DisplayName("Checking LitresToGallons Method")
    @Test
    void testLitresToGallons() {
        assertEquals("21.9974",cf.LitresToGallons(cf.getVal()));
    }

    @DisplayName("Checking LitresToPints Method")
    @Test
    void testLitresToPints() {
        assertEquals("176",cf.LitresToPints(cf.getVal()));
    }

    @DisplayName("Checking LitresToOunces Method")
    @Test
    void testLitresToOunces() {
        assertEquals("3519.5",cf.LitresToOunces(cf.getVal()));
    }

    @DisplayName("Checking LitresToCubicFoot Method")
    @Test
    void testLitresToCubicFoot() {
        assertEquals("3.5314",cf.LitresToCubicFoot(cf.getVal()));
    }

    @DisplayName("Checking LitresToEng Method")
    @Test
    void testLitresToEng() {
        assertEquals("100.0l",cf.LitresToEng(cf.getVal()));
    }

    @DisplayName("Checking KmToMetres Method")
    @Test
    void testKmToMetres() {
        assertEquals("100000",cf.KmToMetres(cf.getVal()));
    }

    @DisplayName("Checking KmToMiles Method")
    @Test
    void testKmToMiles() {
        assertEquals("62.150404",cf.KmToMiles(cf.getVal()));
    }

    @DisplayName("Checking KmToYards Method")
    @Test
    void testKmToYards() {
        assertEquals("109400",cf.KmToYards(cf.getVal()));
    }

    @DisplayName("Checking KmToFeet Method")
    @Test
    void testKmToFeet() {
        assertEquals("328100",cf.KmToFeet(cf.getVal()));
    }

    @DisplayName("Checking KmToInches Method")
    @Test
    void testKmToInches() {
        assertEquals("3937000",cf.KmToInches(cf.getVal()));
    }

    @DisplayName("Checking KmToEngFormat Method")
    @Test
    void testKmToEngFormat() {
        assertEquals("100.0km",cf.KmToEngFormat(cf.getVal()));
    }
}