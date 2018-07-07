<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Line Chart - Combo Time Scale</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.13.0/moment.min.js"></script>
    <script src="./js/chart/Chart.js"></script>
    <script src="./js/chart/utils.js"></script>
    <style>
        canvas {
            -moz-user-select: none;
            -webkit-user-select: none;
            -ms-user-select: none;
        }
    </style>
    <script src="./js/jquery-3.0.0.js"></script>
</head>


<body>
<div style="width:90%">
    <div style="float:left;width: 50%">
        <marquee direction=up behavior=scroll loop=100 scrollamount=1 scrolldelay=10 align=top bgcolor=#ffffff
                 height=300 width=90% hspace=20 vspace=10 onmouseover=this.stop() onmouseout=this.start()>
            |电流:1.2A&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;时间:2018-03-08 11:44:12|<br>
            |电流:1.2A&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;时间:2018-03-08 11:44:12|<br>
            |电流:1.2A&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;时间:2018-03-08 11:44:12|<br>
            |电流:1.2A&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;时间:2018-03-08 11:44:12|<br>
            |电流:1.2A&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;时间:2018-03-08 11:44:12|<br>
        </marquee>
    </div>
    <div style="float:right;width: 50%">
        <canvas id="canvas"></canvas>
    </div>
</div>
<br>
<br>
<button id="randomizeData">Randomize Data</button>
<button id="addDataset">Add Dataset</button>
<button id="removeDataset">Remove Dataset</button>
<button id="addData">Add Data</button>
<button id="removeData">Remove Data</button>
<script>
    var MONTHS = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12'];
    var config = {
        type: 'line',
        data: {
            labels: ['1', '2', '3', '4', '5', '6'],
            datasets: [{
                label: 'My First dataset',
                backgroundColor: window.chartColors.red,
                borderColor: window.chartColors.red,
                data: [
                    randomScalingFactor(),
                    randomScalingFactor(),
                    randomScalingFactor(),
                    randomScalingFactor(),
                    randomScalingFactor(),
                    randomScalingFactor(),
                    randomScalingFactor()
                ],
                fill: false,
            }]
        },
        options: {
            responsive: true,
            title: {
                display: true,
                text: '电流图'
            },
            tooltips: {
                mode: 'index',
                intersect: false,
            },
            hover: {
                mode: 'nearest',
                intersect: true
            },
            scales: {
                xAxes: [{
                    display: true,
                    scaleLabel: {
                        display: true,
                        labelString: '时间'
                    }
                }],
                yAxes: [{
                    display: true,
                    scaleLabel: {
                        display: true,
                        labelString: 'Value'
                    }
                }]
            }
        }
    };

    window.onload = function() {
        var ctx = document.getElementById('canvas').getContext('2d');
        window.myLine = new Chart(ctx, config);
    };

    document.getElementById('randomizeData').addEventListener('click', function() {
        config.data.datasets.forEach(function(dataset) {
            dataset.data = dataset.data.map(function() {
                return randomScalingFactor();
            });

        });

        window.myLine.update();
    });

    var colorNames = Object.keys(window.chartColors);
    document.getElementById('addDataset').addEventListener('click', function() {
        var colorName = colorNames[config.data.datasets.length % colorNames.length];
        var newColor = window.chartColors[colorName];
        var newDataset = {
            label: 'Dataset ' + config.data.datasets.length,
            backgroundColor: newColor,
            borderColor: newColor,
            data: [],
            fill: false
        };

        for (var index = 0; index < config.data.labels.length; ++index) {
            newDataset.data.push(randomScalingFactor());
        }

        config.data.datasets.push(newDataset);
        window.myLine.update();
    });

    document.getElementById('addData').addEventListener('click', function() {
        if (config.data.datasets.length > 0) {
            var month = MONTHS[config.data.labels.length % MONTHS.length];
            config.data.labels.push(month);

            config.data.datasets.forEach(function(dataset) {
                dataset.data.push(randomScalingFactor());
            });

            window.myLine.update();
        }
    });

    document.getElementById('removeDataset').addEventListener('click', function() {
        config.data.datasets.splice(0, 1);
        window.myLine.update();
    });

    document.getElementById('removeData').addEventListener('click', function() {
        config.data.labels.splice(-1, 1); // remove the label first

        config.data.datasets.forEach(function(dataset) {
            dataset.data.pop();
        });

        window.myLine.update();
    });

</script>
</body>

</html>
