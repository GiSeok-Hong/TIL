
# Evaluate Product Sales

Exploratory exercises over the product orders data for Wide World Importers

- What are the top 20 most popular products?
- How do sales of the most popular product vary over time?
- Is there a pattern to these sales?

## What are the most popular products?
Load the libraries required to perform these tasks.


```R
library(AzureML)
library(dplyr)
library(ggplot2)
library(scales)

install.packages("xts") # You also need to install the xts package
library(xts)

install.packages("broom") # And the broom package
library(broom)
```


    Attaching package: ‘dplyr’
    
    The following objects are masked from ‘package:stats’:
    
        filter, lag
    
    The following objects are masked from ‘package:base’:
    
        intersect, setdiff, setequal, union
    
    Installing package into ‘/home/nbuser/R’
    (as ‘lib’ is unspecified)
    Loading required package: zoo
    
    Attaching package: ‘zoo’
    
    The following objects are masked from ‘package:base’:
    
        as.Date, as.Date.numeric


​    
    Attaching package: ‘xts’
    
    The following objects are masked from ‘package:dplyr’:
    
        first, last
    
    The following object is masked from ‘package:AzureML’:
    
        endpoints
    
    Installing package into ‘/home/nbuser/R’
    (as ‘lib’ is unspecified)
    also installing the dependencies ‘generics’, ‘stringr’




```R
library("AzureML")
ws <- workspace()
ordersDataSet <- download.datasets(ws, "Wide World Importers")
head(ordersDataSet)
```


<table>
<thead><tr><th>StockItemId</th><th>Description</th><th>Quantity</th><th>UnitPrice</th><th>PickingCompletedWhen</th></tr></thead>
<tbody>
	<tr><td>164                                                    </td><td>32 mm Double sided bubble wrap 50m                     </td><td>50                                                     </td><td>112                                                    </td><td>1/2/2013 11:00:00 AM                                   </td></tr>
	<tr><td> 67                                                    </td><td>Ride on toy sedan car (Black) 1/12 scale               </td><td>10                                                     </td><td>230                                                    </td><td>1/1/2013 11:00:00 AM                                   </td></tr>
	<tr><td> 50                                                    </td><td>Developer joke mug - old C developers never die (White)</td><td> 9                                                     </td><td> 13                                                    </td><td>1/1/2013 11:00:00 AM                                   </td></tr>
	<tr><td> 89                                                    </td><td>The Gu red shirt XML tag t-shirt (Black) 3XS           </td><td>72                                                     </td><td> 18                                                    </td><td>1/2/2013 11:00:00 AM                                   </td></tr>
	<tr><td>171                                                    </td><td>32 mm Anti static bubble wrap (Blue) 10m               </td><td>90                                                     </td><td> 32                                                    </td><td>1/2/2013 11:00:00 AM                                   </td></tr>
	<tr><td> 10                                                    </td><td>USB food flash drive - chocolate bar                   </td><td> 9                                                     </td><td> 32                                                    </td><td>1/1/2013 11:00:00 AM                                   </td></tr>
</tbody>
</table>



head(dat)

The same product might occur in more than one order. Generate a list of products and their descriptions that have been ordered at least once. Each product should occur only once in the list. Store the result in another dataset called
*stockItemsDataSet*.


```R
ordersDataSet %>%
  select(StockItemId, Description) %>%
  distinct() -> stockItemsDataSet

head(stockItemsDataSet)
```


<table>
<thead><tr><th>StockItemId</th><th>Description</th></tr></thead>
<tbody>
	<tr><td>164                                                    </td><td>32 mm Double sided bubble wrap 50m                     </td></tr>
	<tr><td> 67                                                    </td><td>Ride on toy sedan car (Black) 1/12 scale               </td></tr>
	<tr><td> 50                                                    </td><td>Developer joke mug - old C developers never die (White)</td></tr>
	<tr><td> 89                                                    </td><td>The Gu red shirt XML tag t-shirt (Black) 3XS           </td></tr>
	<tr><td>171                                                    </td><td>32 mm Anti static bubble wrap (Blue) 10m               </td></tr>
	<tr><td> 10                                                    </td><td>USB food flash drive - chocolate bar                   </td></tr>
</tbody>
</table>



Find which products are the most popular, using a *dplyr* pipeline as follows:

- Extract the StockItemID and quantity sold for each order
- Group the results by StockItemID
- Sum the quantity sold for each group, and name the column as *numOrdered*
- Order the results in descending order of *numOrdered* (the most popular items will be at the top of the list)
- Limit the results to the first 20 rows

Save the results in another dataset named *numOrderedDataSet*


```R
ordersDataSet %>%
  select(StockItemId, Quantity) %>%
  group_by(StockItemId) %>%
  summarize(numOrdered = sum(Quantity)) %>% 
  arrange(desc(numOrdered)) %>%
  filter(row_number() <= 20) -> numOrderedDataSet

head(numOrderedDataSet)
```


<table>
<thead><tr><th>StockItemId</th><th>numOrdered</th></tr></thead>
<tbody>
	<tr><td>191   </td><td>207324</td></tr>
	<tr><td>192   </td><td>193680</td></tr>
	<tr><td>189   </td><td>158626</td></tr>
	<tr><td>188   </td><td>152375</td></tr>
	<tr><td>185   </td><td>152125</td></tr>
	<tr><td>184   </td><td>151875</td></tr>
</tbody>
</table>



Combine the *numOrderedDataSet* and the *stockItemsDataSet* over the *StockItemID* column so that the list contains the *StockItemID*, *numOrdered*, and *Description* columns


```R
results <- inner_join(numOrderedDataSet, stockItemsDataSet, by = "StockItemId")

head(results)
```


<table>
<thead><tr><th>StockItemId</th><th>numOrdered</th><th>Description</th></tr></thead>
<tbody>
	<tr><td>191                                             </td><td>207324                                          </td><td>Black and orange fragile despatch tape 48mmx75m </td></tr>
	<tr><td>192                                             </td><td>193680                                          </td><td>Black and orange fragile despatch tape 48mmx100m</td></tr>
	<tr><td>189                                             </td><td>158626                                          </td><td>Clear packaging tape 48mmx75m                   </td></tr>
	<tr><td>188                                             </td><td>152375                                          </td><td>3 kg Courier post bag (White) 300x190x95mm      </td></tr>
	<tr><td>185                                             </td><td>152125                                          </td><td>Shipping carton (Brown) 356x356x279mm           </td></tr>
	<tr><td>184                                             </td><td>151875                                          </td><td>Shipping carton (Brown) 305x305x305mm           </td></tr>
</tbody>
</table>



Generate a graph showing the product descriptions on the X-axis and the number ordered on the Y-axis


```R
options(repr.plot.width=10, repr.plot.height=8)  
ggplot(results) +
  geom_point(mapping = aes(x = reorder(Description, -numOrdered), y = numOrdered), color = "red", size = 5) +
  labs(x = "Product", y = "Total Ordered") +
  scale_x_discrete(labels = function(x) { lapply(strwrap(x, width = 25, simplify = FALSE), paste, collapse = "\n")}) +
  theme(axis.text.x = element_text(angle = 90, size = 10))
```


![image](https://user-images.githubusercontent.com/48499094/56345735-6f176300-61fb-11e9-9778-49d65c4787ba.png)


Task 3

## How do product sales vary over time?

Product 191 (Black and orange fragile despatch tape 48mmx75m) is the most popular product.
How do sales of this product vary over time (if at all). 

Find all sales of product 191.


```R
ordersDataSet %>%
  filter(StockItemId == 191) -> productSalesDataSet

head(productSalesDataSet)
str(productSalesDataSet)
```


<table>
<thead><tr><th>StockItemId</th><th>Description</th><th>Quantity</th><th>UnitPrice</th><th>PickingCompletedWhen</th></tr></thead>
<tbody>
	<tr><td>191                                            </td><td>Black and orange fragile despatch tape 48mmx75m</td><td>288                                            </td><td>3                                              </td><td>1/2/2013 11:00:00 AM                           </td></tr>
	<tr><td>191                                            </td><td>Black and orange fragile despatch tape 48mmx75m</td><td>144                                            </td><td>3                                              </td><td>1/2/2013 11:00:00 AM                           </td></tr>
	<tr><td>191                                            </td><td>Black and orange fragile despatch tape 48mmx75m</td><td>252                                            </td><td>3                                              </td><td>1/2/2013 11:00:00 AM                           </td></tr>
	<tr><td>191                                            </td><td>Black and orange fragile despatch tape 48mmx75m</td><td>108                                            </td><td>3                                              </td><td>1/2/2013 11:00:00 AM                           </td></tr>
	<tr><td>191                                            </td><td>Black and orange fragile despatch tape 48mmx75m</td><td>180                                            </td><td>3                                              </td><td>1/3/2013 11:00:00 AM                           </td></tr>
	<tr><td>191                                            </td><td>Black and orange fragile despatch tape 48mmx75m</td><td>180                                            </td><td>3                                              </td><td>1/4/2013 11:00:00 AM                           </td></tr>
</tbody>
</table>



    'data.frame':	1040 obs. of  5 variables:
     $ StockItemId         : int  191 191 191 191 191 191 191 191 191 191 ...
     $ Description         : chr  "Black and orange fragile despatch tape 48mmx75m" "Black and orange fragile despatch tape 48mmx75m" "Black and orange fragile despatch tape 48mmx75m" "Black and orange fragile despatch tape 48mmx75m" ...
     $ Quantity            : int  288 144 252 108 180 180 252 72 324 216 ...
     $ UnitPrice           : int  3 3 3 3 3 3 3 3 3 3 ...
     $ PickingCompletedWhen: chr  "1/2/2013 11:00:00 AM" "1/2/2013 11:00:00 AM" "1/2/2013 11:00:00 AM" "1/2/2013 11:00:00 AM" ...


Reorganize the data as a time series, based on the *PickingCompletedWhen* column.
Note that this column is actually a string (chr) in month/day/year format, so it needs to be converted to a datetime.


```R
timeSeriesOrders <- xts(productSalesDataSet[c("StockItemId", "Quantity")], 
                        order.by = as.POSIXct(productSalesDataSet$PickingCompletedWhen, format = "%m/%d/%Y"))
head(timeSeriesOrders)
```


               StockItemId Quantity
    2013-01-02         191      288
    2013-01-02         191      144
    2013-01-02         191      252
    2013-01-02         191      108
    2013-01-03         191      180
    2013-01-04         191      180


Work out how many units where ordered each day.


```R
dailyTotals <- apply.daily(timeSeriesOrders, function(x){ apply(x$Quantity, 2, sum)})

head(dailyTotals)
```


               [,1]
    2013-01-02  792
    2013-01-03  180
    2013-01-04  180
    2013-01-10  324
    2013-01-11  324
    2013-01-14  216


Plot a graph showing how the sales vary by day.

First, the time series must be converted back into a dataframe to work with ggplot.


```R
graphData <- tidy(dailyTotals)
head(graphData)
```

    Warning message in data.row.names(row.names, rowsi, i):
    “some row.names duplicated: 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,433,434,435,436,437,438,439,440,441,442,443,444,445,446,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,480,481,482,483,484,485,486,487,488,489,490,491,492,493,494,495,496,497,498,499,500,501,502,503,504,505,506,507,508,509,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651 --> row.names NOT used”


<table>
<thead><tr><th>index</th><th>series</th><th>value</th></tr></thead>
<tbody>
	<tr><td>2013-01-02</td><td>x         </td><td>792       </td></tr>
	<tr><td>2013-01-03</td><td>x         </td><td>180       </td></tr>
	<tr><td>2013-01-04</td><td>x         </td><td>180       </td></tr>
	<tr><td>2013-01-10</td><td>x         </td><td>324       </td></tr>
	<tr><td>2013-01-11</td><td>x         </td><td>324       </td></tr>
	<tr><td>2013-01-14</td><td>x         </td><td>216       </td></tr>
</tbody>
</table>



Then convert the index column back into a datetime value.


```R
graphData$index <- as.POSIXct(graphData$index, origin="1970-01-01")
head(graphData)
```


<table>
<thead><tr><th>index</th><th>series</th><th>value</th></tr></thead>
<tbody>
	<tr><td>2013-01-02</td><td>x         </td><td>792       </td></tr>
	<tr><td>2013-01-03</td><td>x         </td><td>180       </td></tr>
	<tr><td>2013-01-04</td><td>x         </td><td>180       </td></tr>
	<tr><td>2013-01-10</td><td>x         </td><td>324       </td></tr>
	<tr><td>2013-01-11</td><td>x         </td><td>324       </td></tr>
	<tr><td>2013-01-14</td><td>x         </td><td>216       </td></tr>
</tbody>
</table>



Finally, plot the data.


```R
options(repr.plot.width=15, repr.plot.height=5)
ggplot(graphData, aes(x = index, y = value)) +
  ggtitle("Product Sales Over Time for Product 191") +
  xlab("Date") +
  ylab("Units Sold") +
  scale_x_datetime(labels = date_format("%Y-%m"), breaks = date_breaks("months")) +
  theme(axis.text.x = element_text(angle = 45)) +
  geom_point(color = "blue")
```


![image](https://user-images.githubusercontent.com/48499094/56345811-9837f380-61fb-11e9-9e56-21d0ec6e59b8.png)


Task 4

## Is there a pattern to these sales?

Focus on sales for 2013.


```R
firstDay <- as.POSIXct("2013-01-01")
lastDay <- as.POSIXct("2013-12-31")
day1 <- as.numeric(firstDay)
dayN <- as.numeric(lastDay)
productSalesFor2013 <- filter(graphData, (index >= day1) & (index <= dayN))

options(repr.plot.width=15, repr.plot.height=5)
ggplot(productSalesFor2013, aes(x = index, y = value)) +
  ggtitle("Product Sales for Product 191 in 2013") +
  xlab("Date") +
  ylab("Units Sold") +
  scale_x_datetime(labels = date_format("%Y-%m"), breaks = date_breaks("months")) +
  theme(axis.text.x = element_text(angle = 45)) +
  geom_point(color = "blue")
```


![image](https://user-images.githubusercontent.com/48499094/56345854-af76e100-61fb-11e9-9b5c-3e03ac570842.png)


Fit a curve to the sales, and then compare to curves for 2014 and 2015 to see if there is a regular pattern.


```R
ggplot(productSalesFor2013, aes(x = index, y = value)) +
  ggtitle("Product Sales for Product 191 in 2013") +
  xlab("Date") +
  ylab("Units Sold") +
  scale_x_datetime(labels = date_format("%Y-%m"), breaks = date_breaks("months")) +
  theme(axis.text.x = element_text(angle = 45)) +
  geom_point(color = "black", alpha = 0.2) +
  geom_smooth(method = "lm", formula = y ~ poly(x, 9))
```


![image](https://user-images.githubusercontent.com/48499094/56345887-c1588400-61fb-11e9-9c32-2653dc122ee7.png)


The graph and curve for 2014.


```R
firstDay <- as.POSIXct("2014-01-01")
lastDay <- as.POSIXct("2014-12-31")
day1 <- as.numeric(firstDay)
dayN <- as.numeric(lastDay)
productSalesFor2014 <- filter(graphData, (index >= day1) & (index <= dayN))

ggplot(productSalesFor2014, aes(x = index, y = value)) +
  ggtitle("Product Sales for Product 191 in 2014") +
  xlab("Date") +
  ylab("Units Sold") +
  scale_x_datetime(labels = date_format("%Y-%m"), breaks = date_breaks("months")) +
  theme(axis.text.x = element_text(angle = 45)) +
  geom_point(color = "black", alpha = 0.2) +
  geom_smooth(method = "lm", formula = y ~ poly(x, 9))
```


![image](https://user-images.githubusercontent.com/48499094/56345913-d208fa00-61fb-11e9-9f7d-f6943c6b5219.png)


The graph and curve for 2015.


```R
firstDay <- as.POSIXct("2015-01-01")
lastDay <- as.POSIXct("2015-12-31")
day1 <- as.numeric(firstDay)
dayN <- as.numeric(lastDay)
productSalesFor2015 <- filter(graphData, (index >= day1) & (index <= dayN))

ggplot(productSalesFor2015, aes(x = index, y = value)) +
  ggtitle("Product Sales for Product 191 in 2015") +
  xlab("Date") +
  ylab("Units Sold") +
  scale_x_datetime(labels = date_format("%Y-%m"), breaks = date_breaks("months")) +
  theme(axis.text.x = element_text(angle = 45)) +
  geom_point(color = "black", alpha = 0.2) +
  geom_smooth(method = "lm", formula = y ~ poly(x, 9))
```


![image](https://user-images.githubusercontent.com/48499094/56345937-e3520680-61fb-11e9-87b5-6050910cf1e0.png)

