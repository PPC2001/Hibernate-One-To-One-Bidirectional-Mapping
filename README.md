# Hibernate-One-To-One-Bidirectional-Mapping
Hibernate-One-To-One-Bidirectional-Mapping by two ways -
----------
1. without mappedBy = "" and @JoinColumn

   Example - 
   Company to GST Number, here in this example foreign key will generate on both the table because we set @OneToOne annotation in both the entity class  
    
   ![WhatsApp Image 2023-02-21 at 4 01 38 PM](https://user-images.githubusercontent.com/107803628/220320349-8552f1ed-99c3-4f4b-b057-f77c1d3d7c05.jpeg)
   ![WhatsApp Image 2023-02-21 at 4 03 38 PM](https://user-images.githubusercontent.com/107803628/220321310-35902ebe-5cc3-41d6-8b71-bff930a5ddd3.jpeg)





2. with mappedBy = "" and @JoinColumn 
   
   Example - 
   Vehicle to Chassis Number , here in this example foreign key will generate on Chassis table because @JoinColumn used in Chassis entity class and 
   mappedBy = "vehicle" in vehicle entity class.
   
   ![WhatsApp Image 2023-02-21 at 4 09 14 PM](https://user-images.githubusercontent.com/107803628/220322542-085b9f23-6b1e-495c-bb62-3089ddf3c425.jpeg)
   ![WhatsApp Image 2023-02-21 at 4 08 40 PM](https://user-images.githubusercontent.com/107803628/220322548-35b6f734-db3c-42a6-93e0-5e2a4f784d8a.jpeg)
