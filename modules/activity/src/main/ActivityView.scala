package lila.activity

import org.joda.time.DateTime

import lila.study.Study
import lila.practice.PracticeStudy

import activities._

case class ActivityView(
    games: Option[Games],
    puzzles: Option[Puzzles],
    practice: Option[Map[PracticeStudy, Int]]
) {
}

object ActivityView {

  case class AsTo(day: DateTime, activity: ActivityView)
}