import junit.framework.Assert;
import org.junit.Test;



public class MaryTest {

	
	@Test
	public void testForTotalMark()
	{
		CourseUnit courseunit = new CourseUnit("BSE4012",4,90,80,79,89);
		Assert.assertEquals(87, courseunit.getTotal());
		
	}
	@Test
	public void testForStudentObject()
	{
	Student student =new Student("Donald","Kasagga","RegNumber",212011921);
	Student student2 = new Student("Donald","Kasagga","RegNumber",212011921);
	Assert.assertEquals(student2 .getFirstName(),student.getFirstName());
	
	
	}

}
