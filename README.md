A - Watermelon
<dd style="padding-top: 20px; height: auto !important;"><div style="padding: 0px 20px 20px;"><p>One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their opinion. After that the watermelon was weighed, and the scales showed <span class="tex-span"><i>w</i></span> kilos. They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.</p><p>Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.</p></div><h3 style="margin: 20px 20px 0 20px">Input</h3><div style="padding: 0px 20px 20px;"><p>The first (and the only) input line contains integer number <span class="tex-span"><i>w</i></span> (<span class="tex-span">1 ≤ <i>w</i> ≤ 100</span>) — the weight of the watermelon bought by the boys.</p></div><h3 style="margin: 20px 20px 0 20px">Output</h3><div style="padding: 0px 20px 20px;"><p>Print <span class="tex-font-style-tt">YES</span>, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and <span class="tex-font-style-tt">NO</span> in the opposite case.</p></div><h3 style="margin: 20px 20px 0 20px">Sample 1</h3><div style="padding: 0px 20px 20px;"><table class="vjudge_sample">
<thead>
  <tr>
    <th>Input<span class="copier">copy</span></th>
    <th>Output<span class="copier">copy</span></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td><pre>8
</pre></td>
    <td><pre>YES
</pre></td>
  </tr>
</tbody>
</table>
</div><h3 style="margin: 20px 20px 0 20px">Note</h3>
  <div style="padding: 0px 20px 20px;"><p>For example, the boys can divide the watermelon into two parts of 2 and 6 kilos respectively (another variant — two parts of 4 and 4 kilos).</p></div>
  
<h2 id="problem-title">B - Before an Exam</h2>
<dd style="padding-top: 20px"><div style="padding: 0px 20px 20px;"><p>Tomorrow Peter has a Biology exam. He does not like this subject much, but <span class="tex-span"><i>d</i></span> days ago he learnt that he would have to take this exam. Peter's strict parents made him prepare for the exam immediately, for this purpose he has to study not less than <span class="tex-span"><i>minTime</i><sub class="lower-index"><i>i</i></sub></span> and not more than <span class="tex-span"><i>maxTime</i><sub class="lower-index"><i>i</i></sub></span> hours per each <span class="tex-span"><i>i</i></span>-th day. Moreover, they warned Peter that a day before the exam they would check how he has followed their instructions.</p><p>So, today is the day when Peter's parents ask him to show the timetable of his preparatory studies. But the boy has counted only the sum of hours <span class="tex-span"><i>sumTime</i></span> spent him on preparation, and now he wants to know if he can show his parents a timetable <span class="tex-span"><i>sсhedule</i></span> with <span class="tex-span"><i>d</i></span> numbers, where each number <span class="tex-span"><i>sсhedule</i><sub class="lower-index"><i>i</i></sub></span> stands for the time in hours spent by Peter each <span class="tex-span"><i>i</i></span>-th day on biology studies, and satisfying the limitations imposed by his parents, and at the same time the sum total of all <span class="tex-span"><i>schedule</i><sub class="lower-index"><i>i</i></sub></span> should equal to <span class="tex-span"><i>sumTime</i></span>.</p></div><h3 style="margin: 20px 20px 0 20px">Input</h3><div style="padding: 0px 20px 20px;"><p>The first input line contains two integer numbers <span class="tex-span"><i>d</i>, <i>sumTime</i></span> (<span class="tex-span">1 ≤ <i>d</i> ≤ 30, 0 ≤ <i>sumTime</i> ≤ 240</span>) — the amount of days, during which Peter studied, and the total amount of hours, spent on preparation. Each of the following <span class="tex-span"><i>d</i></span> lines contains two integer numbers <span class="tex-span"><i>minTime</i><sub class="lower-index"><i>i</i></sub>, <i>maxTime</i><sub class="lower-index"><i>i</i></sub></span> (<span class="tex-span">0 ≤ <i>minTime</i><sub class="lower-index"><i>i</i></sub> ≤ <i>maxTime</i><sub class="lower-index"><i>i</i></sub> ≤ 8</span>), separated by a space — minimum and maximum amount of hours that Peter could spent in the <span class="tex-span"><i>i</i></span>-th day.</p></div><h3 style="margin: 20px 20px 0 20px">Output</h3><div style="padding: 0px 20px 20px;"><p>In the first line print <span class="tex-font-style-tt">YES</span>, and in the second line print <span class="tex-span"><i>d</i></span> numbers (separated by a space), each of the numbers — amount of hours, spent by Peter on preparation in the corresponding day, if he followed his parents' instructions; or print <span class="tex-font-style-tt">NO</span> in the unique line. If there are many solutions, print any of them.</p></div><h3 style="margin: 20px 20px 0 20px">Sample 1</h3><div style="padding: 0px 20px 20px;"><table class="vjudge_sample">
<thead>
  <tr>
    <th>Input<span class="copier">copy</span></th>
    <th>Output<span class="copier">copy</span></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td><pre>1 48
5 7
</pre></td>
    <td><pre>NO
</pre></td>
  </tr>
</tbody>
</table>
</div><h3 style="margin: 20px 20px 0 20px">Sample 2</h3><div style="padding: 0px 20px 20px;"><table class="vjudge_sample">
<thead>
  <tr>
    <th>Input<span class="copier">copy</span></th>
    <th>Output<span class="copier">copy</span></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td><pre>2 5
0 1
3 5
</pre></td>
    <td><pre>YES
1 4 </pre></td>
  </tr>
</tbody>
</table>
</div></dd>

<h2 id="problem-title">C - Team</h2>
<dd style="padding-top: 20px"><div style="padding: 0px 20px 20px;"><p>One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.</p><p>This contest offers <span class="tex-span"><i>n</i></span> problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.</p></div><h3 style="margin: 20px 20px 0 20px">Input</h3><div style="padding: 0px 20px 20px;"><p>The first input line contains a single integer <span class="tex-span"><i>n</i></span> (<span class="tex-span">1 ≤ <i>n</i> ≤ 1000</span>) — the number of problems in the contest. Then <span class="tex-span"><i>n</i></span> lines contain three integers each, each integer is either <span class="tex-span">0</span> or <span class="tex-span">1</span>. If the first number in the line equals <span class="tex-span">1</span>, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.</p></div><h3 style="margin: 20px 20px 0 20px">Output</h3><div style="padding: 0px 20px 20px;"><p>Print a single integer — the number of problems the friends will implement on the contest.</p></div><h3 style="margin: 20px 20px 0 20px">Sample 1</h3><div style="padding: 0px 20px 20px;"><table class="vjudge_sample">
<thead>
  <tr>
    <th>Input<span class="copier">copy</span></th>
    <th>Output<span class="copier">copy</span></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td><pre>3
1 1 0
1 1 1
1 0 0
</pre></td>
    <td><pre>2
</pre></td>
  </tr>
</tbody>
</table>
</div><h3 style="margin: 20px 20px 0 20px">Sample 2</h3><div style="padding: 0px 20px 20px;"><table class="vjudge_sample">
<thead>
  <tr>
    <th>Input<span class="copier">copy</span></th>
    <th>Output<span class="copier">copy</span></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td><pre>2
1 0 0
0 1 1
</pre></td>
    <td><pre>1
</pre></td>
  </tr>
</tbody>
</table>
</div><h3 style="margin: 20px 20px 0 20px">Note</h3><div style="padding: 0px 20px 20px;"><p>In the first sample Petya and Vasya are sure that they know how to solve the first problem and all three of them know how to solve the second problem. That means that they will write solutions for these problems. Only Petya is sure about the solution for the third problem, but that isn't enough, so the friends won't take it. </p><p>In the second sample the friends will only implement the second problem, as Vasya and Tonya are sure about the solution.</p></div><h3 style="margin: 20px 20px 0 20px">Sponsor</h3><div><!-- Prob desc tail -->
<ins class="adsbygoogle" style="display: block; height: 90px;" data-ad-client="ca-pub-9098591903020457" data-ad-slot="1011472145" data-ad-format="horizontal" data-full-width-responsive="true" data-adsbygoogle-status="done"><div id="aswift_1_host" style="border: none; height: 90px; width: 799px; margin: 0px; padding: 0px; position: relative; visibility: visible; background-color: transparent; display: inline-block;"></div></ins>
<script>
  (adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div></dd>
