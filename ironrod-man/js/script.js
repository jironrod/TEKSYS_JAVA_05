var world = [
    [2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2],
    [4, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4],
    [4, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 3, 3, 1, 3, 1, 1, 1, 1, 1, 3, 3, 3, 3, 4],
    [4, 1, 3, 3, 3, 3, 3, 1, 3, 1, 3, 3, 3, 1, 3, 1, 3, 3, 3, 1, 3, 3, 3, 3, 4],
    [4, 1, 1, 1, 3, 3, 3, 1, 3, 1, 1, 3, 3, 1, 3, 1, 3, 3, 3, 1, 3, 3, 3, 3, 4],
    [4, 3, 3, 1, 3, 3, 3, 1, 3, 3, 1, 3, 3, 1, 3, 1, 1, 3, 3, 1, 3, 1, 1, 1, 4],
    [4, 3, 3, 1, 3, 1, 1, 1, 3, 3, 1, 3, 3, 1, 1, 3, 1, 3, 3, 1, 3, 1, 3, 1, 4],
    [4, 1, 1, 1, 3, 1, 3, 2, 3, 3, 1, 3, 3, 3, 1, 3, 1, 3, 3, 1, 3, 1, 3, 1, 4],
    [4, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 3, 1, 3, 3, 1, 1, 1, 3, 1, 4],
    [4, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 3, 3, 3, 3, 3, 3, 1, 0],
    [2, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2],
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
];

var score = 0;

var ironrod = {
    x: 3,
    y: 12
}

function displayWorld() {
    var output = '';

    for (var i = 0; i < world.length; i++) {
        output += "\n<div class='row'>\n";
        for (var j = 0; j < world[i].length; j++) {
            if (world[i][j] == 5)
                output += "<div class='brick'></div>"
            else if (world[i][j] == 4)
                output += "<div class='brick2'></div>"
            else if (world[i][j] == 3)
                output += "<div class='evil'></div>"
            else if (world[i][j] == 2)
                output += "<div class='sentinel'></div>"
            else if (world[i][j] == 1)
                output += "<div class='coin'></div>"
            else if (world[i][j] == 0)
                output += "<div class='empty'></div>"
        }
        output += "\n</div>";
    }
    // console.log(output);
    document.getElementById('world').innerHTML = output;
}

function displayIronRod() {
    document.getElementById('ironrod').style.top = ironrod.y * 50 + "px";
    document.getElementById('ironrod').style.left = ironrod.x * 50 + "px";
}
function displayScore() {
    document.getElementById('score').innerHTML = score;
}

displayWorld();
displayIronRod();
displayScore();

document.onkeydown = function (e) {
    if (e.key == 'ArrowLeft') {
        ironrod.x--;
    }
    else if (e.key == 'ArrowRight') {
        ironrod.x++;
    }
    else if (e.key == 'ArrowUp') {
        ironrod.y--;
    }
    else if (e.key == 'ArrowDown') {
        ironrod.y++;
    }
    if (world[ironrod.y][ironrod.x] == 1) {
        world[ironrod.y][ironrod.x] = 0;
        score += 10;
        displayWorld();
        displayScore();
    }
    // console.log(e);
    displayIronRod();
}

// && world[ironrod.y][ironrod.x-1] != 2 