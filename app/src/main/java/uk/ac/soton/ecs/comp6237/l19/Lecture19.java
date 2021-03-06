package uk.ac.soton.ecs.comp6237.l19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openimaj.content.slideshow.AudioVideoSlide;
import org.openimaj.content.slideshow.PictureSlide;
import org.openimaj.content.slideshow.Slide;
import org.openimaj.content.slideshow.SlideshowApplication;
import org.openimaj.video.VideoDisplay.EndAction;

import uk.ac.soton.ecs.comp6237.utils.Utils;
import uk.ac.soton.ecs.comp6237.utils.annotations.JvmArgs;
import uk.ac.soton.ecs.comp6237.utils.annotations.Lecture;

@Lecture(title = "L19: Mining Events from Multimedia Streams",
handoutsURL = "https://github.com/jonhare/COMP6237/blob/master/notes/SED.pdf",
slidesURL = "http://comp6237.ecs.soton.ac.uk/lectures/pdf/SED.pdf")
@JvmArgs(vmArguments = "-Xmx1G")
public class Lecture19 {
	public static void main(String[] args) throws IOException {
		final List<Slide> slides = new ArrayList<Slide>();

		for (int i = 1; i <= 55; i++) {
			slides.add(new PictureSlide(Lecture19.class.getResource(String.format("l19.%03d.jpeg", i))));
		}

		slides.set(23, new AudioVideoSlide(Lecture19.class.getResource("twitter-pulse-ui.mpg"), EndAction.STOP_AT_END));

		new SlideshowApplication(slides, 1024, 768, Utils.BACKGROUND_IMAGE);
	}
}
