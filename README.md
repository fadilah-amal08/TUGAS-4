# TUGAS-4
1. Selection Sort

  a. Algoritma Selection Sort
  
    Langkah 1 - Setel MIN ke lokasi 0
    Langkah 2 - Cari elemen minimum dalam daftar
    Langkah 3 - Tukar dengan nilai di lokasi MIN
    Langkah 4 - Menambah MIN untuk menunjuk ke elemen berikutnya
    Langkah 5 - Ulangi hingga daftar diurutkan
    
  b. Pseudocode Selection Sort
  
    procedure selection sort 
    list  : array of items
    n     : size of list

     for i = 1 to n - 1
   /* set current element as minimum*/
      min = i    
  
      /* check the element to be minimum */

      for j = i+1 to n 
         if list[j] < list[min] then
            min = j;
         end if
        end for

      /* swap the minimum element with the current element*/
      if indexMin != i  then
         swap list[min] and list[i]
      end if
      end for
      end procedure
   
2. Insertion Sort

  a. Algoritma Insertion Sort
  
    Langkah 1 - Jika itu adalah elemen pertama, itu sudah diurutkan. return 1;
    Langkah 2 - Pilih elemen berikutnya
    Langkah 3 - Bandingkan dengan semua elemen dalam sub-daftar yang diurutkan
    Langkah 4 - Geser semua elemen dalam sub-daftar yang diurutkan yang lebih besar dari nilai yang akan diurutkan
    Langkah 5 - Masukkan nilainya
    Langkah 6 - Ulangi sampai daftar diurutkan
    
  b. Pseudocode Insertion Sort
  
    procedure insertionSort( A : array of items )
    int holePosition
    int valueToInsert
	
    for i = 1 to length(A) inclusive do:
	
      /* select value to be inserted */
      valueToInsert = A[i]
      holePosition = i
      
      /*locate hole position for the element to be inserted */
		
      while holePosition > 0 and A[holePosition-1] > valueToInsert do:
         A[holePosition] = A[holePosition-1]
         holePosition = holePosition -1
      end while
		
      /* insert the number at hole position */
      A[holePosition] = valueToInsert
      
    end for
    end procedure
   
3. Bubble Sort

  a. Algoritma Bubble Sort
  
    Kami menganggap daftar adalah larik n elemen. Kami lebih lanjut mengasumsikan bahwa 
    fungsi swap swap nilai-nilai elemen array yang diberikan.
    begin BubbleSort(list)
    for all elements of list
    if list[i] > list[i+1]
    swap(list[i], list[i+1])
    end if
    end for
    return list
    end BubbleSort
    
  b. Pseudocode Bubble Sort
  
    procedure bubbleSort( list : array of items )
    loop = list.count;
    for i = 0 to loop-1 do:
    swapped = false
      for j = 0 to loop-1 do:
         /* compare the adjacent elements */   
         if list[j] > list[j+1] then
            /* swap them */
            swap( list[j], list[j+1] )		 
            swapped = true
         end if  
      end for
      /*if no number was swapped that means 
      array is sorted now, break the loop.*/
      
      if(not swapped) then
         break
      end if   
    end for
    end procedure return list
    
4. Linear Search

  a. Algoritma Linear Search 
  
    Linear Search (Array A, Value x)
    Langkah 1: Setel ke 1
    Langkah 2: jika saya> lanjutkan ke langkah 7
    Langkah 3: jika A [i] = x, lanjutkan ke langkah 6
    Langkah 4: Setel saya ke i + 1
    Langkah 5: Lanjutkan ke Langkah 2
    Langkah 6: Elemen Cetak x Ditemukan di indeks i dan lanjutkan ke langkah 8
    Langkah 7: Elemen cetak tidak ditemukan
    Langkah 8: Keluar
    
  b. Pseudocode Linear Search
  
    procedure linear_search (list, value)
    for each item in the list
      if match item == value
      return the item's location
      end if
      end for
      end procedure
    
