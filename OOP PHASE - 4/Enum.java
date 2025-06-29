public class Enum {
    // Defining Enum
    public enum Day {
        Monday,
        TuesDay,
        WednesDay,
        ThursDay,
        FriDay,
        SatuarDay,
        SunDay
    }

    // Enumeration for Orderstatus.
    static enum OrderStatus {
        ORDERED,
        PREPARING,
        READY_FOR_PICKUP,
        DELIVERED,
        CANCELED
    }

    // Craete food order class.
    static class FoodOrder {
        int orderId;
        String customerName;
        OrderStatus status;

        // Create a Constructor.
        FoodOrder(int orderId, String customerName) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.status = OrderStatus.ORDERED;
        }

        public void updateStatus(OrderStatus newStatus) {
            // newstatus Delived and cancel pop up that msg.
            if (newStatus == OrderStatus.DELIVERED || newStatus == OrderStatus.CANCELED) {
                System.out.println("Order already completed or cancelled. Cannot update.");
                return;
            }

            this.status = newStatus;
            System.out.println("Status updated to: " + newStatus);
        }

        public void printSummary() {
            System.out.println("Order #" + orderId + " | Customer: " + customerName + " | Status: " + status);
        }

        public OrderStatus getStatus() {
            return status;
        }

    }

    public static void main(String[] args) {
        // 🔹what is Enum ?
        // -> In java Enumeration is a special data type used to define collection
        // -> of constants data like Day of week , direction , status code.

        // Use like this.
        Day day = Day.Monday;
        System.out.println(day);

        // Real Life Example.
        // 🍕 Scenario: Food Order Tracking System.
        // -> You're building a Java-based backend system for a food delivery app like
        // Zomato or Swiggy.
        // -> Every order goes through multiple stages:
        // 1. Orderd.
        // 2. Preparing.
        // 3. Ready_For_Pickup
        // 4. Delivered.
        // 5. Canceled.

        FoodOrder order1 = new FoodOrder(012, "John");
        order1.printSummary(); // Initial state.

        order1.updateStatus(OrderStatus.PREPARING);
        order1.updateStatus(OrderStatus.READY_FOR_PICKUP);
        order1.updateStatus(OrderStatus.DELIVERED);

        // Trying to update after delivered
        order1.updateStatus(OrderStatus.CANCELED); // Should be blocked

        // now print summary.
        order1.printSummary();
    }
}
