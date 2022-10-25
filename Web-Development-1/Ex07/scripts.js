/** Lágmark bolla sem má velja. */
const MIN_NUM_OF_CUPS = 2;

/** Hámark bolla sem má velja. */
const MAX_NUM_OF_CUPS = 10;

/** Fjöldi spilaðra leikja. */
let played = 0;

/** Fjöldi unnra leikja. */
let won = 0;

/** Fjöldi stiga. */
let points = 0;

/**
 * Athugar hvort gefin tala sé á bilinu [min, max].
 *
 * @param {string | number} numAsString Tala sem á að athuga.
 * @param {number} min Lágmark sem tala má vera.
 * @param {number} max Hámark sem tala má vera.
 * @returns `true` ef tala er innan bils, annars `false`.
 */
function isValidNum(numAsString, min, max) {
  let ValidNum = parseInt(numAsString);
  if (min > ValidNum || ValidNum > max) {
    return false;
  }
  return true;
}

/**
 * Nær í gisk frá notanda.
 *
 * @param {number} numOfCups Heildar fjöldi bolla.
 * @returns `null` ef notandi hættir við, annars vali notanda sem tölu.
 */
function getChoice(numOfCups) {
  let guess = prompt(`Hvaða bolla veluru af ${numOfCups}?`)
  if (guess === null) {
    return null;
  }

  while (true) {
    if (isValidNum(guess,MIN_NUM_OF_CUPS, numOfCups)) {
      break;
    } else
      guess = prompt(
        `Vinsamlegast veldu aðeins tölu milli ${MIN_NUM_OF_CUPS} og ${numOfCups}`
      );
  }

  let bollar = randomNumber(MIN_NUM_OF_CUPS, numOfCups);
  let bollarStig = bollar - 1;
  let result = 0;

  if (guess == bollar) {
    alert(`Rétt. Þú færð ${bollarStig} stig.`);
    points += bollarStig;
    result = 1;
  } else {
    alert(`Rangt, boltinn var í bolla númer ${bollar}`);
    result = -1;
  }
  return result;
}

/**
 * Skilar tölu af handahófi á bilinu [min, max].
 *
 * @param {number} min Lágmark bils.
 * @param {number} max Hámark bils.
 * @returns Tala af handahófi á bili [min, max].
 */
function randomNumber(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

/**
 * Spilum leik.
 */
function play() {
  do {
    const numOfCups = prompt(`Hve marga bolla?
  Verður að vera gildi á bilinu [${MIN_NUM_OF_CUPS}, ${MAX_NUM_OF_CUPS}].
  Þú færð N-1 fyrir að finna bolta í N bollum.
  Ýttu á cancel eða ESC til að hætta.`);
    const numOfCupsNumber = parseInt(numOfCups);

    // Ýtt á ESC/Cancel
    if (numOfCups === null) {
      return;
    }
    if (isNaN(numOfCupsNumber)){
      console.error(`${numOfCups} er ekki löglegt gildi.`);
      return;
    }

    if (!isValidNum(numOfCupsNumber, MIN_NUM_OF_CUPS, MAX_NUM_OF_CUPS)) {
      console.error(`${numOfCupsNumber} er ekki löglegt gildi.`);
      return;
    }

    const result = getChoice(numOfCups);

    if (result === null) {
      return;
    }
    if (result === 1) {
      won ++;
      played ++;
    } else if (result === -1) {
      played ++;
    }
  } while (confirm("Spila aftur?"));
  
}

/**
 * Birtir stöðu spilara.
 */
function games() {
  if (played === 0) {
    console.log("Þú hefur ekki spilað neina leiki");
  } else {
    console.log(`Leikir spilaðir: ${played}. Unnir leikir: ${won}. Stig: ${points}`);
  }
}
