

```python
# Download the movie ratings and IMDB movie titles from the sample datasets collection
from azureml import Workspace

ws = Workspace()
dsRatings = ws.datasets['Movie Ratings']
ratings = dsRatings.to_dataframe()

dsMovies = ws.datasets['Movie Names']
movies = dsMovies.to_dataframe()
```


```python
# Examine the first few rows in each dataset
print(ratings.head())
print()
print(movies.head())

```

       UserId  MovieId  Rating   Timestamp
    0       1    68646      10  1381620027
    1       1   113277      10  1379466669
    2       2   454876       8  1394818630
    3       2   790636       7  1389963947
    4       2   816711       8  1379963769
    
       Movie ID                                     Movie Name
    0         8  Edison Kinetoscopic Record of a Sneeze (1894)
    1        91                     Le manoir du diable (1896)
    2       417                  Le voyage dans la lune (1902)
    3       628                        The  s of Dollie (1908)
    4       833                      The Country Doctor (1909)



```python
# Rename the columns in the movies dataset and reindex it using the MovieId
# Makes it easier to join the datasets later
movies.rename(columns = {'Movie ID': 'MovieId', 'Movie Name': 'MovieName'}, inplace = True)
movies = movies.set_index('MovieId')
movies.head()

```




<div>
<table class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>MovieName</th>
    </tr>
    <tr>
      <th>MovieId</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>8</th>
      <td>Edison Kinetoscopic Record of a Sneeze (1894)</td>
    </tr>
    <tr>
      <th>91</th>
      <td>Le manoir du diable (1896)</td>
    </tr>
    <tr>
      <th>417</th>
      <td>Le voyage dans la lune (1902)</td>
    </tr>
    <tr>
      <th>628</th>
      <td>The  s of Dollie (1908)</td>
    </tr>
    <tr>
      <th>833</th>
      <td>The Country Doctor (1909)</td>
    </tr>
  </tbody>
</table>
</div>




```python
# Import the numpy and pandas modules
import numpy as np
import pandas as pd

```


```python
# What is the average rating for each movie?
meanRatings = ratings.groupby(['MovieId']).mean()
meanRatings.head()

```




<div>
<table class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>UserId</th>
      <th>Rating</th>
      <th>Timestamp</th>
    </tr>
    <tr>
      <th>MovieId</th>
      <th></th>
      <th></th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>8</th>
      <td>3296.0</td>
      <td>5.0</td>
      <td>1.396981e+09</td>
    </tr>
    <tr>
      <th>91</th>
      <td>4879.0</td>
      <td>6.0</td>
      <td>1.385233e+09</td>
    </tr>
    <tr>
      <th>417</th>
      <td>15463.0</td>
      <td>7.0</td>
      <td>1.392806e+09</td>
    </tr>
    <tr>
      <th>628</th>
      <td>13752.0</td>
      <td>4.5</td>
      <td>1.383588e+09</td>
    </tr>
    <tr>
      <th>833</th>
      <td>19326.0</td>
      <td>3.0</td>
      <td>1.385739e+09</td>
    </tr>
  </tbody>
</table>
</div>




```python
# Join the results with the movie data (containing the movie names), and sort by rating
movieData = pd.concat([meanRatings, movies], axis = 1).sort_values(['Rating'], ascending = False)
del movieData['UserId']
del movieData['Timestamp']
movieData

```




<div>
<table class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Rating</th>
      <th>MovieName</th>
    </tr>
    <tr>
      <th>MovieId</th>
      <th></th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>283742</th>
      <td>10.0</td>
      <td>Inspiraci�n (2001)</td>
    </tr>
    <tr>
      <th>2461862</th>
      <td>10.0</td>
      <td>The Oscars (2013)</td>
    </tr>
    <tr>
      <th>2374002</th>
      <td>10.0</td>
      <td>Minte-ma frumos (2012)</td>
    </tr>
    <tr>
      <th>119843</th>
      <td>10.0</td>
      <td>Oscar and Lucinda (1997)</td>
    </tr>
    <tr>
      <th>254481</th>
      <td>10.0</td>
      <td>Koi... Mil Gaya (2003)</td>
    </tr>
    <tr>
      <th>254679</th>
      <td>10.0</td>
      <td>Pesar-e Mariam (1998)</td>
    </tr>
    <tr>
      <th>97202</th>
      <td>10.0</td>
      <td>Dip huet seung hung (1989)</td>
    </tr>
    <tr>
      <th>44860</th>
      <td>10.0</td>
      <td>The Lusty Men (1952)</td>
    </tr>
    <tr>
      <th>44821</th>
      <td>10.0</td>
      <td>Lambert the Sheepish Lion (1952) Animation</td>
    </tr>
    <tr>
      <th>44517</th>
      <td>10.0</td>
      <td>The Crimson Pirate (1952)</td>
    </tr>
    <tr>
      <th>497876</th>
      <td>10.0</td>
      <td>46-okunen no koi (2006)</td>
    </tr>
    <tr>
      <th>44760</th>
      <td>10.0</td>
      <td>Ivanhoe (1952)</td>
    </tr>
    <tr>
      <th>3188690</th>
      <td>10.0</td>
      <td>The Making of a Queen (2013)</td>
    </tr>
    <tr>
      <th>2851112</th>
      <td>10.0</td>
      <td>Colonel Badd (2013)</td>
    </tr>
    <tr>
      <th>97116</th>
      <td>10.0</td>
      <td>Cousins (1989)</td>
    </tr>
    <tr>
      <th>1621046</th>
      <td>10.0</td>
      <td>Cesar Chavez (2014)</td>
    </tr>
    <tr>
      <th>902955</th>
      <td>10.0</td>
      <td>Barda (2007)</td>
    </tr>
    <tr>
      <th>45034</th>
      <td>10.0</td>
      <td>Le plaisir (1952)</td>
    </tr>
    <tr>
      <th>69375</th>
      <td>10.0</td>
      <td>Three on a Meathook (1973)</td>
    </tr>
    <tr>
      <th>45186</th>
      <td>10.0</td>
      <td>The Star (1952)</td>
    </tr>
    <tr>
      <th>45223</th>
      <td>10.0</td>
      <td>One Way Ticket to Hell (1955)</td>
    </tr>
    <tr>
      <th>69334</th>
      <td>10.0</td>
      <td>Swayamvaram (1973)</td>
    </tr>
    <tr>
      <th>1124055</th>
      <td>10.0</td>
      <td>She Could Be You (2008)</td>
    </tr>
    <tr>
      <th>62185</th>
      <td>10.0</td>
      <td>Reflections in a Golden Eye (1967)</td>
    </tr>
    <tr>
      <th>69303</th>
      <td>10.0</td>
      <td>Sounder (1972)</td>
    </tr>
    <tr>
      <th>3181962</th>
      <td>10.0</td>
      <td>The Last Shepherd (2013)</td>
    </tr>
    <tr>
      <th>3181128</th>
      <td>10.0</td>
      <td>Mac &amp;amp; Jack (2013)</td>
    </tr>
    <tr>
      <th>1702014</th>
      <td>10.0</td>
      <td>Hoje Eu Quero Voltar Sozinho (2014)</td>
    </tr>
    <tr>
      <th>97527</th>
      <td>10.0</td>
      <td>The   Show (1989)</td>
    </tr>
    <tr>
      <th>3177332</th>
      <td>10.0</td>
      <td>Story (2013)</td>
    </tr>
    <tr>
      <th>...</th>
      <td>...</td>
      <td>...</td>
    </tr>
    <tr>
      <th>3503730</th>
      <td>NaN</td>
      <td>After My Garden Grows (2014)</td>
    </tr>
    <tr>
      <th>3503838</th>
      <td>NaN</td>
      <td>Kau neoi bat lei saam hing dai (2013)</td>
    </tr>
    <tr>
      <th>3505786</th>
      <td>NaN</td>
      <td>Europe in 8 Bits (2013)</td>
    </tr>
    <tr>
      <th>3505950</th>
      <td>NaN</td>
      <td>Bei Jing ai qing gu shi (2014)</td>
    </tr>
    <tr>
      <th>3509662</th>
      <td>NaN</td>
      <td>Feriado (2014)</td>
    </tr>
    <tr>
      <th>3510372</th>
      <td>NaN</td>
      <td>Excuse My French (2014)</td>
    </tr>
    <tr>
      <th>3511542</th>
      <td>NaN</td>
      <td>Mo jing (2014)</td>
    </tr>
    <tr>
      <th>3518988</th>
      <td>NaN</td>
      <td>Harmontown (2014)</td>
    </tr>
    <tr>
      <th>3531852</th>
      <td>NaN</td>
      <td>Bhoothnath Returns (2014)</td>
    </tr>
    <tr>
      <th>3540044</th>
      <td>NaN</td>
      <td>Ah Beng Mission Impossible (2014)</td>
    </tr>
    <tr>
      <th>3547106</th>
      <td>NaN</td>
      <td>Dont Be Tired (2013)</td>
    </tr>
    <tr>
      <th>3569788</th>
      <td>NaN</td>
      <td>Naan Sigappu Manithan (2014)</td>
    </tr>
    <tr>
      <th>3587466</th>
      <td>NaN</td>
      <td>Jaguar Rendezvous (2014)</td>
    </tr>
    <tr>
      <th>3605606</th>
      <td>NaN</td>
      <td>Mr. Fraud (2014)</td>
    </tr>
    <tr>
      <th>3608654</th>
      <td>NaN</td>
      <td>The Coed and the Zombie Stoner (2014)</td>
    </tr>
    <tr>
      <th>3608838</th>
      <td>NaN</td>
      <td>Dreamworks Spooky Stories (2012)</td>
    </tr>
    <tr>
      <th>3608848</th>
      <td>NaN</td>
      <td>NOW In the Wings on a World Stage (2014)</td>
    </tr>
    <tr>
      <th>3640226</th>
      <td>NaN</td>
      <td>Dangerous Mind of a Hooligan (2014)</td>
    </tr>
    <tr>
      <th>3645014</th>
      <td>NaN</td>
      <td>The Xpose (2014)</td>
    </tr>
    <tr>
      <th>3646462</th>
      <td>NaN</td>
      <td>Itirazim Var (2014)</td>
    </tr>
    <tr>
      <th>3650534</th>
      <td>NaN</td>
      <td>Rouhs Beauty (2014)</td>
    </tr>
    <tr>
      <th>3668162</th>
      <td>NaN</td>
      <td>Bangalore Days (2014)</td>
    </tr>
    <tr>
      <th>3671074</th>
      <td>NaN</td>
      <td>Romeo Ranjha (2014)</td>
    </tr>
    <tr>
      <th>3677366</th>
      <td>NaN</td>
      <td>Skoryy Moskva-Rossiya (2014)</td>
    </tr>
    <tr>
      <th>3692324</th>
      <td>NaN</td>
      <td>The Mall (2014)</td>
    </tr>
    <tr>
      <th>3709344</th>
      <td>NaN</td>
      <td>CityLights (2014)</td>
    </tr>
    <tr>
      <th>3711466</th>
      <td>NaN</td>
      <td>Kukhnya v Parizhe (2014)</td>
    </tr>
    <tr>
      <th>3720636</th>
      <td>NaN</td>
      <td>Gods Own Country (2014)</td>
    </tr>
    <tr>
      <th>3740242</th>
      <td>NaN</td>
      <td>Naked Ambition 3D (2014)</td>
    </tr>
    <tr>
      <th>3740916</th>
      <td>NaN</td>
      <td>16 Tons (2011)</td>
    </tr>
  </tbody>
</table>
<p>16614 rows × 2 columns</p>
</div>




```python
# How frequently do viewers post ratings?

# Step 1: Reorganize the ratings data to index by the timestamp
ratings.index = ratings.Timestamp
ratings.index = ratings.index.astype('datetime64[s]')
ratings.index
del ratings['Timestamp']
ratings.head()

```




<div>
<table class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>UserId</th>
      <th>MovieId</th>
      <th>Rating</th>
    </tr>
    <tr>
      <th>Timestamp</th>
      <th></th>
      <th></th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>2013-10-12 23:20:27</th>
      <td>1</td>
      <td>68646</td>
      <td>10</td>
    </tr>
    <tr>
      <th>2013-09-18 01:11:09</th>
      <td>1</td>
      <td>113277</td>
      <td>10</td>
    </tr>
    <tr>
      <th>2014-03-14 17:37:10</th>
      <td>2</td>
      <td>454876</td>
      <td>8</td>
    </tr>
    <tr>
      <th>2014-01-17 13:05:47</th>
      <td>2</td>
      <td>790636</td>
      <td>7</td>
    </tr>
    <tr>
      <th>2013-09-23 19:16:09</th>
      <td>2</td>
      <td>816711</td>
      <td>8</td>
    </tr>
  </tbody>
</table>
</div>




```python
# Step 2: Count the number of ratings for each day ('D')
dailyRatings = ratings.resample('D').count()
del dailyRatings['UserId']
del dailyRatings['MovieId']
dailyRatings.rename(columns = {'Rating': 'NumRatings'}, inplace = True)
dailyRatings.head()

```




<div>
<table class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>NumRatings</th>
    </tr>
    <tr>
      <th>Timestamp</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>2013-02-28</th>
      <td>245</td>
    </tr>
    <tr>
      <th>2013-03-01</th>
      <td>509</td>
    </tr>
    <tr>
      <th>2013-03-02</th>
      <td>672</td>
    </tr>
    <tr>
      <th>2013-03-03</th>
      <td>905</td>
    </tr>
    <tr>
      <th>2013-03-04</th>
      <td>570</td>
    </tr>
  </tbody>
</table>
</div>




```python
#Step 3: Graph the results
import matplotlib.pyplot as plt
get_ipython().magic('matplotlib inline')

plt.rcParams["figure.figsize"] = [12, 9] 
plt.plot(dailyRatings)
```

    /home/nbuser/anaconda3_23/lib/python3.4/site-packages/matplotlib/font_manager.py:273: UserWarning: Matplotlib is building the font cache using fc-list. This may take a moment.
      warnings.warn('Matplotlib is building the font cache using fc-list. This may take a moment.')
    /home/nbuser/anaconda3_23/lib/python3.4/site-packages/matplotlib/font_manager.py:273: UserWarning: Matplotlib is building the font cache using fc-list. This may take a moment.
      warnings.warn('Matplotlib is building the font cache using fc-list. This may take a moment.')





    [<matplotlib.lines.Line2D at 0x7fac4c3d0cf8>]

![image](https://user-images.githubusercontent.com/48499094/56339166-08d51500-61e8-11e9-90d9-d4cd041638c4.png)




