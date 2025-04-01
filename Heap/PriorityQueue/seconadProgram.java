// ///---------->set() --> is used to update the value of Specific posotion of ArrayList 
// /// Set(Index,Upadte vale);




// import java.util.*;
// public class seconadProgram{
//     ArrayList<Integer> arr = new ArrayList<>();
//     public void addlastIndex(int data){


        
        
    
//         arr.add(data);
//  int x = arr.size()-1;
//  int parent = (x-1)/2;

//  while(arr.get(x) < arr.get(parent)){
//     int temp = arr.get(x);

//     arr.set(x,arr.get(parent));
//     arr.set(parent,temp);
//  }
//     }
//     public static void main(String[]args){

//         seconadProgram obj = new seconadProgram();
//         obj.addlastIndex(52);
//         obj.addlastIndex(58);
//         obj.addlastIndex(56);
// obj.addlastIndex(1);
// System.out.println(obj.arr);
//     }
// }




import java.util.*;

class Car {
    int x, y;
    double distance;

    Car(int x, int y, int userX, int userY) {
        this.x = x;
        this.y = y;
        this.distance = Math.sqrt((x - userX) * (x - userX) + (y - userY) * (y - userY)); // Distance from (1,1)
    }
}

class seconadProgram {
    public static void findNearestKCars(int[][] cars, int k, int userX, int userY) {
        PriorityQueue<Car> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b.distance, a.distance));

        for (int[] car : cars) {
            Car c = new Car(car[0], car[1], userX, userY);
            maxHeap.add(c);

            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the farthest car
            }
        }

        List<Car> result = new ArrayList<>(maxHeap);
        result.sort(Comparator.comparingDouble(c -> c.distance)); // Sort for correct order

        for (int i = 0; i < result.size(); i++) {
            System.out.println("C" + i );
        }
    }

    public static void main(String[] args) {
        int[][] cars = {{1, 2}, {3, 4}, {1, -1}, {0, 5}, {2, 3}, {-1, -2}};
        int k = 2;
        int userX = 0, userY = 0; // User's position

        findNearestKCars(cars, k, userX, userY);
    }
}
