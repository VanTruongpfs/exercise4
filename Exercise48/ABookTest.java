package Exercise48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ABookTest {
/**
 * this is testing for constructor
 */
	@Test
	public void testConstructor() {
// this is a constructor of class HardCover
		new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
		new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
		new HardCover("1984", "George Orwell", 15, 1949, 0.8);
// this is a constructor of class Sale
		new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
		new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
		new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
// this is a constructor of class PaperBack
		new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
		new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
		new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
	}
/**
 * this is testing for method salePrice()
 */
	@Test
	public void testSalePrice() {
// this is testing method salePrice() for HardCover
		ABook h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
		ABook h2 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
		ABook h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
			assertEquals(h1.salePrice(), 20);
			assertEquals(h2.salePrice(), 16);
			assertEquals(h3.salePrice(), 12);
// this is testing method salePrice() for Sale
		ABook s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
		ABook s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
		ABook s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
			assertEquals(s1.salePrice(), 7.5);
			assertEquals(s2.salePrice(), 6);
			assertEquals(s3.salePrice(), 10);
// this is testing method salePrice() for PaperBack
		ABook p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
		ABook p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
		ABook p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
			assertEquals(p1.salePrice(), 10);
			assertEquals(p2.salePrice(), 15);
			assertEquals(p3.salePrice(), 20);
	}
/**
 * this is testing for method cheaperThan()
 */
	@Test
	public void testCheaperThan() {
// this is testing method cheaperThan() for HardCover
		ABook h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
		ABook h2 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
		ABook h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
			assertFalse(h1.cheaperThan(h2));
			assertFalse(h2.cheaperThan(h3));
			assertTrue(h3.cheaperThan(h1));
// this is testing method cheaperThan() for Sale
		ABook s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
		ABook s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
		ABook s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
			assertFalse(s1.cheaperThan(s2));
			assertTrue(s2.cheaperThan(s3));
			assertFalse(s3.cheaperThan(s1));
// this is testing method cheaperThan() for PaperBack
		ABook p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
		ABook p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
		ABook p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
			assertTrue(p1.cheaperThan(p2));
			assertTrue(p2.cheaperThan(p3));
			assertFalse(p3.cheaperThan(p1));
	}
/**
 * this is testing for method sameName()
 */
	@Test
	public void testSameName() {
// this is testing method sameName() for HardCover
		ABook h1 = new HardCover("The Great Gatsby", "F. Scott Fitzgerald", 25, 1925, 0.8);
		ABook h2 = new HardCover("To Kill a Mockingbird", "Harper Lee", 20, 1960, 0.8);
		ABook h3 = new HardCover("1984", "George Orwell", 15, 1949, 0.8);
			assertTrue(h1.sameName(h1));
			assertFalse(h1.sameName(h2));
			assertFalse(h2.sameName(h3));
// this is testing method sameName() for Sale
		ABook s1 = new Sale("Influence: The Psychology of Persuasion", "Robert Cialdini", 15, 2006, 0.5);
		ABook s2 = new Sale("To Sell Is Human: The Surprising Truth About Moving Others", "Daniel H. Pink", 12, 2012, 0.5);
		ABook s3 = new Sale("The Challenger Sale: Taking Control of the Customer Conversation", "Matthew Dixon and Brent Adamson", 20, 2011, 0.5);
			assertTrue(s1.sameName(s1));
			assertFalse(s1.sameName(s2));
			assertFalse(s2.sameName(s3));
// this is testing method sameName() for PaperBack
		ABook p1 = new PaperBack("Đắc Nhân Tâm", "Dale Carnegie", 10, 1936);
		ABook p2 = new PaperBack("Bí Quyết Thành Công", "Napoleon Hill", 15, 1937);
		ABook p3 = new PaperBack("Thế giới đã đổi thay bạn chưa?", "Robert T. Kiyosaki", 20, 2005);
			assertTrue(p1.sameName(p1));
			assertFalse(p1.sameName(p2));
			assertFalse(p2.sameName(p3));
	}

}
